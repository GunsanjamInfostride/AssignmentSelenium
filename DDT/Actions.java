package DDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Actions 
{
	String pathdriver;
	WebDriver driver;
	public void Alert()
	{
		pathdriver=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.out.println(pathdriver);
		
		System.setProperty("webdriver.chrome.driver", pathdriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
	}
	public static void main(String[] args)
	{
		Actions p= new Actions();
		p.Alert();
	}
}
