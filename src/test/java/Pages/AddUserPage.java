package Pages;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import Test_Base.Base;

public class AddUserPage extends Base
{
	@FindBy(id="add")
	WebElement addbtn;
	
	@FindBy(id="name")
	WebElement typename;
	
	@FindBy(id="introduced")
	WebElement typedate;
	
	@FindBy(id="discontinued")
	WebElement enddate;
	
	@FindBy(id="company")
	WebElement typecompany;
	
	@FindBy(partialLinkText ="Create this computer")
	WebElement create;
	
	@FindBy(linkText = "Cancel")
	WebElement cncl;
	
	public AddUserPage()
	{
		PageFactory.initElements(driver,this);
	}
	@Test
	public void Adding() throws InterruptedException
	{
		addbtn.click();
		Thread.sleep(4000);
	}
	@Test
	public void data() throws IOException 
	{

		
	String path = System.getProperty("user.dir")+"\\Test Data\\UserData.xlsx";
	
	//Step-2 Give path in FileInputstream class from where you want to run
	FileInputStream fis = new FileInputStream(path);
	
	//Step-3 Move to workbook
	XSSFWorkbook oo = new XSSFWorkbook(fis);
	
	//Step-4 Move to specific sheet
	XSSFSheet sheet =oo.getSheet("Fetch_Data");
	
	//Step-5 Read rows from sheet containing data
	System.out.println(sheet.getLastRowNum());
	
	//Step-6 Read data from cell
	//String uname = sheet.getRow(3).getCell(0).getStringCellValue();
	//System.out.println("Username is:" +uname);
	for(int i=1;i<=sheet.getLastRowNum();i++)
	{
		String name=sheet.getRow(i).getCell(0).getStringCellValue();
		typename.sendKeys(name);
		String intro=sheet.getRow(i).getCell(1).getStringCellValue();
		typedate.sendKeys(intro);
		String con=sheet.getRow(i).getCell(1).getStringCellValue();
		enddate.sendKeys(con);
		String comp=sheet.getRow(i).getCell(1).getStringCellValue();
		typecompany.sendKeys(comp);
		create.click();
	}
	
}
	@Test
	public void Cancelbtn()
	{
		cncl.click();
	}


}


