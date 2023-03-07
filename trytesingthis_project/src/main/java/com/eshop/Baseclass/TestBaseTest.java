package com.eshop.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBaseTest()
	{
		prop=new Properties();
		FileInputStream fis;
		try
		{
			fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\selelium_maven_project_artifact\\src\\main\\java\\com\\eshop\\Config\\config.properties");
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("testurl"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	
	
}
