package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WordPress 
{
	String path,pathdriver;
	WebDriver driver;
	String uname,pass,message;
	public void LoginHrm() throws IOException
	{
		pathdriver=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.out.println(pathdriver);
		
		System.setProperty("webdriver.chrome.driver", pathdriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Step-1 Giving path of xlsx file
		path = System.getProperty("user.dir")+"//TestData//Login_Data.xlsx";
		
		//Step-2 Give path in FileInputstream class from where you want to run
		FileInputStream fis = new FileInputStream(path);
		
		//Step-3 Move to workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Step-4 Move to specific sheet
		XSSFSheet sheet =wb.getSheet("Login_Details");
		
		//Step-5 Read rows from sheet containing data
		System.out.println(sheet.getLastRowNum());
		
		//Step-6 Read data from cell
		//String uname = sheet.getRow(3).getCell(0).getStringCellValue();
		//System.out.println("Username is:" +uname);
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			uname=sheet.getRow(i).getCell(0).getStringCellValue();
			driver.findElement(By.id("txtUsername")).sendKeys(uname);
			pass=sheet.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.id("txtPassword")).sendKeys(pass);
			
			FileOutputStream df = new FileOutputStream(path);
			message="Data imported Successfully";
			sheet.getRow(i).createCell(4).setCellValue(message);
			wb.write(df);
			df.close();
			
			driver.findElement(By.id("btnLogin")).click();
		}
	}
	
	
	public static void main(String [] args) throws IOException
	{
		WordPress oo = new WordPress();
		oo.LoginHrm();
	}

}
