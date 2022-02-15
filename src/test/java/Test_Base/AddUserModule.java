package Test_Base;

import java.io.IOException;
import org.junit.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Pages.AddUserPage;

public class AddUserModule extends Base
{
	public AddUserModule()
	{
		super();
	}
	
	@BeforeSuite
	public void setup() throws IOException
	{
		Base.initialization();
	}
@Test
public void Test1() throws IOException, InterruptedException 
{
	pageFactory.getPage().data();
}

@AfterSuite
public void quit()
{
	driver.close();
}
}
