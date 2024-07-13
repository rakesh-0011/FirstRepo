package basiweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tet1 
{
public static WebDriver driver;

@BeforeTest
public void tweqet1()
{
	//WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	
}


@Test
public void Loadingpage()
{
	driver = new ChromeDriver();
	System.out.println(driver.getCurrentUrl());
}

}
