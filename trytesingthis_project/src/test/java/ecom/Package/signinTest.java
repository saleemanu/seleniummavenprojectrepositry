package ecom.Package;

import org.testng.annotations.Test;

public class signinTest extends LoginTest {
	
	
	@Test(priority=0)
	public void signin()
	{
		System.out.println("signin click");
	}
	@Test(priority=1)
	public void signinverify()
	{
		System.out.println("verified sign in");
	}
}
