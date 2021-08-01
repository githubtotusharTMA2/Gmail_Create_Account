package test_cases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Create_Account_Till_OTP_Page;
import test_base.Test_Base;

public class Create_Account_Till_OTP_Test extends Test_Base
{
	// Step 1 - Global Variables -
	
	Create_Account_Till_OTP_Page cap;
	
	// Step 2 - Constructor -
	
	public Create_Account_Till_OTP_Test()
	{
		super();
	}
	
	// Step 3 - BeforeMethod -
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		cap = new Create_Account_Till_OTP_Page();
	}
	
	// Step 4 - Test - 
	
	@Test
	public void create_Account_Till_OTP_Test()
	{
		cap.create_Account_Till_OTP_Process("MainAttacker", "TMA", "tma2mm", "main_in_tma", "+16174010273");
		Assert.assertTrue(driver.findElement(By.id("code")).isDisplayed());
	}
	
	// Step 5 - AfterMethod -
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(50000);
		driver.quit();
	}
	
}
