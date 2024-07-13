package basiweb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNG2 
{
	@BeforeClass
	void login()
	{
		System.out.println("this is login");
	}
	@Test(priority =1)
	void search()
	{
		System.out.println("this is seach");
	}
	@Test(priority =2)
	void AdSearch()
	{
		System.out.println("this is advance search");
	}
	@AfterClass
	void logout()
	{
		System.out.println("this is logout");
	}

}
