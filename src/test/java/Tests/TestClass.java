package Tests;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.LoginPage;
import TestBase.TestParent;


public class TestClass extends TestParent
{
	LoginPage oo;
	public TestClass()
	{
		super();
	}
	@BeforeSuite
	public void Launch()
	{
		initialization();
		//oo = new LoginPage(driver);
	}
	@Test
	public void logindetails() throws IOException
	{
		obj.getlogin().Login();
	}
	@Test
	public void forgetpass()
	{
		obj.getlogin().forgot();
	}
}
