package Pagefactory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Pages.AddUserPage;
import Pages.HomePage;

public class ObjectFactory 
{
	WebDriver driver;
	private AddUserPage pgobj;
	private HomePage hpobj;
	
	public ObjectFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	@Test
	
	public AddUserPage getPage()
	{
		if(pgobj == null)
		{
			pgobj = new AddUserPage();
		}
		return pgobj;
		
	}
	
	@Test
	public HomePage gethome()
	{
		if(hpobj == null)
		{
			hpobj = new HomePage();
		}
		return hpobj;
	}

}
