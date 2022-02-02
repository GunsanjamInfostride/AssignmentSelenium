package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Testing_Data 
	{
		public static WebDriver driver;
		public static String path;
@BeforeSuite
	public void Launch_Browser() {
			path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
			System.out.println(path);
			
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
	}
@AfterSuite
		public void Close_Browser() {
			driver.close();
		}
		
}


