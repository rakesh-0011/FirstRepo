package basiweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstTestClass 
{

	WebDriver  driver;
	
	FirstTestClass(WebDriver driver)
	{
		this.driver = driver;
	}
	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_passsord_loc = By.xpath("//input[@placeholder='Password']']");
	By txt_login_loc = By.xpath("//button[@type='submit']");
	
	
	public void Username(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
		
	}
	public void setPassword(String pwd)
	{
		driver.findElement(txt_passsord_loc).sendKeys(pwd);
		
	}
	
	public void Login()
	{
		
		driver.findElement(txt_login_loc).click();
		
	}
	

}
