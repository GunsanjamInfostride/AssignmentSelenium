package Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.Base;

public class HomePage extends Base
{
	@FindBy(id="searchbox")
	WebElement box;
	
	@FindBy(id="searchsubmit")
	WebElement submit;
	
	@FindBy(partialLinkText="Next →")
	WebElement Next;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void searching() throws IOException
	{
	
		String path1 = System.getProperty("user.dir")+"\\Test Data\\Filter.xlsx";
		
		//Step-2 Give path in FileInputstream class from where you want to run
		FileInputStream fis = new FileInputStream(path1);
		
		//Step-3 Move to workbook
		XSSFWorkbook bj = new XSSFWorkbook(fis);
		
		//Step-4 Move to specific sheet
		XSSFSheet sheet =bj.getSheet("Search_Data");
		
		//Step-5 Read rows from sheet containing data
		System.out.println(sheet.getLastRowNum());
		
		//Step-6 Read data from cell
		//String uname = sheet.getRow(3).getCell(0).getStringCellValue();
		//System.out.println("Username is:" +uname);
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			String searchname=sheet.getRow(i).getCell(0).getStringCellValue();
			box.sendKeys(searchname);
			submit.click();
	    }
     }
	
	public void check()
	{
		Next.click();
	}
}
