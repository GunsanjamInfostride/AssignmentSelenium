package TestNGDemo;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Dashboard extends Testing_Data {
    String actualTitle;
@Test
	public void Page() {
		actualTitle = driver.getTitle();
		assertEquals(actualTitle, "OrangeHRM");
}
@Test
    public void Logout() {
    	driver.findElement(By.partialLinkText("Welcome")).click();
    	driver.findElement(By.linkText("Logout")).click();
    }
	
}
