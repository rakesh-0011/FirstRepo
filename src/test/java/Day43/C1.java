package Day43;

import org.testng.annotations.*;

public class C1 
{
	@Test
	void login()
	{
		System.out.println("this is login");
	}
	@BeforeTest
	void search()
	{
		System.out.println("this is seach");
	}

}
