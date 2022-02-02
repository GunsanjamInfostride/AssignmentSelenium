package DDT;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window 
{
	String pathdriver;
	WebDriver driver;
	public void Window()
	{
		pathdriver=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.out.println(pathdriver);
		
		System.setProperty("webdriver.chrome.driver", pathdriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.partialLinkText("Click Here")).click();
		
		//To get id of the window
		Set<String> id = driver.getWindowHandles();
		System.out.println("Id is:"+id);
		
		Iterator<String> it= id.iterator(); 
		String parent_id = it.next();
		
		String child_id = it.next();
		System.out.println("Parent Window is:"+parent_id);
		System.out.println("Child Window is:"+child_id);
		
		driver.switchTo().window(child_id);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent_id);
		System.out.println(driver.getTitle());
	}
	

	public static void main(String[] args)
	{
		Multiple_Window k = new Multiple_Window();
		k.Window();
		
	}
}
