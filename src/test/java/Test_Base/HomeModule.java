package Test_Base;

import java.io.IOException;
import Pages.HomePage;
import org.junit.Test;

public class HomeModule extends Base
{
	@Test
	public void Test1() throws IOException
	{
		pageFactory.gethome().searching();
	}
}
