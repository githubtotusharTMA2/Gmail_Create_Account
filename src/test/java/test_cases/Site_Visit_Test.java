package test_cases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test_base.Test_Base;

public class Site_Visit_Test extends Test_Base
{
	
	// Step 1 - Constructor
	
	public Site_Visit_Test()
	{
		super();
	}
	
	// Step 2 - BeforeMethod -
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	// Step 3 -
	
	@Test
	public void site_Visit_Test()
	{
		Assert.assertTrue(driver.findElement(By.id("logo")).isDisplayed());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
