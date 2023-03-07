package ecom.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTest extends LoginTest {
	
	@Test(priority=0)
	public void hompageverify()
	{
	System.out.println("Homepage verifed");
	}
	
	@Test
	public void maximize()
	{
		driver.manage().window().maximize();
		
	}
	
	
	

}
