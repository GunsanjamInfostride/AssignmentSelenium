package Groups;

import org.testng.annotations.Test;

public class GroupOfGroups
{
	@Test(groups={"Smoke"})
	public void testcase1()
	{
		System.out.println("Test case belongs to Smoke testing");
	}
	@Test(groups={"Sanity"})
	public void testcase2()
	{
		System.out.println("Test case belongs to Sanity Testing");
	}
	@Test(groups={"Regression"})
	public void testcase3()
	{
		System.out.println("Test case belongs to Regression Testing");
	}
}
