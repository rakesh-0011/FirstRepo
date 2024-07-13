package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2
{
	@Test
	void AdSearch()
	{
		System.out.println("this is advance search");
	}
	@AfterTest
	void logout()
	{
		System.out.println("this is logout");
	}


}
