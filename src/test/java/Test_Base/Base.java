package Test_Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

//import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;

import Pagefactory.ObjectFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public static WebDriver driver;
    public static Properties prop;
    public static ObjectFactory pageFactory;
    
    @BeforeClass
    public static void initialization()  throws IOException
    {
    	
    	try
        {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\Configuration\\config.properties");
            prop.load(fis);
        } 
         catch (IOException e)
        {
            e.printStackTrace();
        }
    	
    		pageFactory = new ObjectFactory(driver);
        	WebDriverManager.chromedriver().setup();
        	driver =new ChromeDriver();
        	driver.manage().window().maximize();
            //driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
            driver.get(prop.getProperty("url"));
        }
    	
//    	@AfterClass
//    	public static void shutdown()
//    	{
//    		driver.close();
//    	}

}