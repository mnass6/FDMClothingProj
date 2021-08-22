package buyItemsTests;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import testData.DataFile;
import driverUtilities.DriverUtilities;

import org.junit.Assert;

import buyItems.HomePageNotLoggedIn;
import buyItems.LoggedInHomePage;
import buyItems.PopUp;
import buyItems.RegisterPage;
import buyItems.TShirts;
import buyItems.AuthenticationPage;

public class RegisterUserV1
{
	WebDriver driver; // This needs to be at the class level else you cannot use it in the methods below

	@Before						
	public void preConditions()
	{ 			
		// The driver instantiation is moved to the preconditions
		// Doesn't affect the outcome of the test so should be here
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();

		driver.get(DataFile.websiteURL);
		driver.manage().window().maximize();
		// Pre-Condition: Add code to check if user is registered
	}
	
	@Test
	public void registerUser() throws InterruptedException
	{	
		//Step 1 Click the Sign-In button to register
		HomePageNotLoggedIn.signInButton(driver).click();
		//The user is directed to the Authentication Page
		System.out.println("I am here 1");
		Assert.assertEquals(DataFile.authenticationPageHeading, AuthenticationPage.heading(driver).getText());
		
		//Step 2 Enter a valid email address in the Email Address field
		Thread.sleep(5000); //Should use an explicit wait here
		String createduser = DataFile.registeredEmail;
		AuthenticationPage.emailField(driver).sendKeys(createduser);
		//The email address is shown in the Email Address  field
		Assert.assertEquals(DataFile.registeredEmail, AuthenticationPage.emailField(driver).getAttribute("value"));
		System.out.println("I am here 2");
	
		//Step 3 Click the Create An Account button
		AuthenticationPage.createAccountButton(driver).click();
		Thread.sleep(5000); //Should use an explicit wait here
		//The user is directed to the Create An Account Page
		Assert.assertEquals(DataFile.registrationPageHeading, RegisterPage.heading(driver).getText());
		System.out.println("I am here 3");
		
		//Step 4 Select a radio button for Title
		Thread.sleep(5000); //Should use an explicit wait here
		RegisterPage.mrTickbox(driver).click();
		//The radio button is highlighted
		Thread.sleep(5000); //Should use an explicit wait here
		Assert.assertTrue(RegisterPage.mrTickbox(driver).isSelected());
		System.out.println("I am here 4");

		//Step 5 Enter a first name into the First Name field
		RegisterPage.firstNamePersonalInfoField(driver).sendKeys(DataFile.firstName);
		//The first name appears in the First Name field
		Assert.assertEquals(DataFile.firstName, RegisterPage.firstNamePersonalInfoField(driver).getAttribute("value"));
		System.out.println("I am here 5");
		
		//Step 6 Enter a last name into the Last Name field
		RegisterPage.lastNamePersonalInfoField(driver).sendKeys(DataFile.lastName);
		//The last name appears in the Last Name field
		Assert.assertEquals(DataFile.lastName, RegisterPage.lastNamePersonalInfoField(driver).getAttribute("value"));
		//Step 6a The email address should be pre-populated with what was entered previously
		Assert.assertEquals(DataFile.registeredEmail, RegisterPage.emailAddressField(driver).getAttribute("value"));
		System.out.println("I am here 6");
		
		//Step 7 Enter a valid password
		RegisterPage.passwordField(driver).sendKeys(DataFile.registeredPassword);
		//Step 7a Check Password
		Assert.assertTrue(RegisterPage.passwordField(driver).getAttribute("type").equals("password"));
		//Step 7b Check First Name
		Assert.assertEquals(DataFile.firstName,RegisterPage.firstNameYourAddressField(driver).getAttribute("value"));
		//Step 7c Check Last Name
		Assert.assertEquals(DataFile.lastName, RegisterPage.lastNameYourAddressField(driver).getAttribute("value"));
		System.out.println("I am here 7");
		
		//Step 8 Enter a valid address
		RegisterPage.addressField(driver).sendKeys(DataFile.address);
		//The address appears in the Address field.
		Assert.assertEquals(DataFile.address, RegisterPage.addressField(driver).getAttribute("value"));
		
		//Step 9 Enter a valid city
		RegisterPage.cityField(driver).sendKeys(DataFile.city);
		//The city appears in the City field
		Assert.assertEquals(DataFile.city, RegisterPage.cityField(driver).getAttribute("value"));
	
		//Step 10 Enter a valid state
		Select stateFieldSelect = new Select(RegisterPage.stateDropDown(driver));
		stateFieldSelect.selectByVisibleText(DataFile.state);
		//Take a screenshot here
		// MISSING ASSERT: The state appears in the State field. 
	
		//Step 11 Enter a valid postal code
		RegisterPage.postalCodeField(driver).sendKeys(DataFile.postalCode);
		//The postal code appears in the Zip/Postal Code field.
		Assert.assertEquals(DataFile.postalCode, RegisterPage.postalCodeField(driver).getAttribute("value"));

		//Step 12 Enter a valid mobile phone number
		RegisterPage.mobilePhoneField(driver).sendKeys(DataFile.mobileNumber);
		//The mobile phone number appears in the Mobile Phone Number field. 
		Assert.assertEquals(DataFile.mobileNumber, RegisterPage.mobilePhoneField(driver).getAttribute("value"));
	
		//Step 13 Click register
		RegisterPage.registerButton(driver).click();
		//The user is registered on to the My Account Page.
		Assert.assertEquals(DataFile.loggedInHomePageHeading, LoggedInHomePage.heading(driver).getText());
		
		//Step 14 Click sign out button
		LoggedInHomePage.signOutButton(driver).click();
		//The user is logged out and taken to the Authentication Page.
		Assert.assertEquals(DataFile.authenticationPageHeading,AuthenticationPage.heading(driver).getText());

		//Step 15 Enter the email address registered under ALREADY REGISTERED? Section
		AuthenticationPage.emailAlreadyRegisteredField(driver).sendKeys(createduser);
		//The email address is entered into the Email Address field
		//Assert.assertEquals(DataFile.registeredEmail, AuthenticationPage.emailAlreadyRegisteredField(driver).getAttribute("value"));
		
		//Step 16 Enter the password registered under ALREADY REGISTERED? Section 
		AuthenticationPage.passwordAlreadyRegisteredField(driver).sendKeys(DataFile.password);
		//The password is entered into the Password field
		Assert.assertTrue(AuthenticationPage.passwordAlreadyRegisteredField(driver).getAttribute("type").equals("password"));

		//Step 17 Click the Sign in button
		AuthenticationPage.signInButton(driver).click();
		//The user is logged in on the My Account page.
		Assert.assertEquals(DataFile.loggedInHomePageHeading, LoggedInHomePage.heading(driver).getText());	
		//MISSING ASSERT: The first name plus last name are shown in the top-right-hand corner.
		Assert.assertEquals(DataFile.customerAccount, LoggedInHomePage.customerAccount(driver).getText());
		
		//Action Class
		Actions actions	= new Actions(driver);
		
		//Step 1 Click T-Shirts link
		LoggedInHomePage.tShirts(driver).click();
		Thread.sleep(5000);
		Assert.assertEquals(DataFile.tShirtPageHeading, TShirts.heading(driver).getText());
		System.out.println("I am here A");
		
		
		//Step 2 Add a T-Shirt to the cart
	/*	Thread.sleep(5000);
		actions.moveToElement(TShirts.hoverItem(driver)).perform();
		System.out.println("I am here B");*/
		Thread.sleep(5000);
		TShirts.selectItem(driver,1).click();
		Thread.sleep(15000);
		//A pop up will be displayed
		TShirts.clickAddToCartOnPopUp(driver).click();
		//TShirts.clickProductName(driver);
		System.out.println("I am here C");
		
		//Assert added to check message "Product successfully added to your shopping cart"
		
		Thread.sleep(10000); //Allows time for pop up to appear
		
	
		Assert.assertEquals(DataFile.tShirtPopUpHeading, PopUp.tShirtPopUpHeading(driver));
		System.out.println("I am here D");
		
	}
	
	
	@After					
	public void tearDown()
	{ 			
		// Typical functionality is to close the browser after you have finished the test
		//driver.quit();
	}
}