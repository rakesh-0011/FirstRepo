package basiweb;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Loginest 
{
	WebDriver  driver;
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	void Testlogin()
	{
		FirstTestClass FTS = new FirstTestClass(driver);
		FTS.Username("Admin");
		FTS.setPassword("admin123");
		FTS.Login();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
		
	}

}
