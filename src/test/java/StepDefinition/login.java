package StepDefinition;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login 
{
	WebDriver driver;

	@Given("^user is on login page$")
	public void user_is_on_Login_Page()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Then("^user enters username in username textfield$")
	public void user_enters_username_in_username_textfield()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	
	@Then("^user enters password in password textfield$")
	public void user_enters_password_in_password_textfield()
	{
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	
	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button()
	{
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("^user is on Home Page$")
	public void user_is_on_Home_Page()
	{
		Assert.assertEquals("OrangeHRM", driver.getTitle());
	}

//	@When("^enters the username and enters the password$")
//	public void enters_the_username_and_enters_the_password(io.cucumber.datatable.DataTable dataTable)
//	{
//		List<List<String>> data = dataTable.asLists(String.class);
//		driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.id("txtPassword")).sendKeys(data.get(1).get(1));
//	}
	
	@Then("enters {string} and enters the {string}")
	public void enters_username_and_enters_the_password(String uname, String pass)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
	}
	
	@Then("click on login button")
	public void click_on_login_button()
	{
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
}
