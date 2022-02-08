package PageFactory;

import org.testng.annotations.Test;

import Pages.LoginPage;

public class ObjectPageFactory
{
	private LoginPage loginobj;
	@Test
	public LoginPage getlogin()
	{
		if(loginobj == null)
		{
			loginobj = new LoginPage();
		}
		return loginobj;
		
	}
}
