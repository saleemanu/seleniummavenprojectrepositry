package ecom.Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	@Test
	public void setup()
	{
		SoftAssert softassert=new SoftAssert();
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		String expectedtitle="Automation Exercise";
		String actualtitle=driver.getTitle();
		softassert.assertEquals(actualtitle,expectedtitle);
		softassert.assertAll();		
	}
	
	
	
	@AfterSuite
	@Test
	public void teardown()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.quit();
	}
	
	
}
