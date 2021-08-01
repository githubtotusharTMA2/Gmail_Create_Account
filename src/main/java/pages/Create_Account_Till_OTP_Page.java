package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_base.Test_Base;

public class Create_Account_Till_OTP_Page extends Test_Base
{
	// Step 1 - Global Variables -
	
	@FindBy(xpath = "//span[contains(text(), 'Create account')]")
	WebElement create_Account_Button;
	
	@FindBy(xpath = "//span[contains(text(), 'For myself')]")
	WebElement for_Myself;
	
	@FindBy(name = "firstName")
	WebElement firstNameField;
	
	@FindBy(name = "lastName")
	WebElement lastNameField;
	
	@FindBy(name = "Username")
	WebElement email;
	
	@FindBy(name = "Passwd")
	WebElement password;
	
	@FindBy(name = "ConfirmPasswd")
	WebElement confirm_password;
	
	@FindBy(xpath = "//span[contains(text(), 'Next')]")
	WebElement next_Button;
	
	@FindBy(id = "phoneNumberId")
	WebElement phone_Number;
	
	@FindBy(xpath = "//span[contains(text(), 'Next')]")
	WebElement next_Button_2;
	
	// Step 2 - Constructor -
	
	public Create_Account_Till_OTP_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Step 3 - Methods -
	
	public void create_Account_Till_OTP_Process(String first_Name, String last_Name, String email_in_method, String password_in_method, String phone_Number_in_method)
	{
		create_Account_Button.click();
		for_Myself.click();
		firstNameField.sendKeys(first_Name);
		lastNameField.sendKeys(last_Name);
		email.sendKeys(email_in_method);
		password.sendKeys(password_in_method);
		confirm_password.sendKeys(password_in_method);
		next_Button.click();
		phone_Number.sendKeys(phone_Number_in_method);
		try
		{
			next_Button.click();
		}
		catch(Exception e)
		{
			next_Button.click();
		}
		
	}
	
}
