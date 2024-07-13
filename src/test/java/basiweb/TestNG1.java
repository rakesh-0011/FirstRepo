package basiweb;

import org.testng.annotations.Test;

public class TestNG1 
{
	/*
	 * @BeforeMethod public void UserReg() { System.out.println("user reg"); }
	 */

	@Test(priority = 3)
	public void UserLogin1()
	{
		System.out.println("user logged ing1");
	}
	@Test(priority = 2, enabled = false)
	public void UserLogin2()
	{
		System.out.println("user logged ing2");
	}
	@Test(priority = 1)
	public void UserLogin3()
	{
		System.out.println("user logged ing3");
	}
	
	/*
	 * @AfterMethod public void UserLogout() {
	 * System.out.println("user logged out"); }
	 */

}
