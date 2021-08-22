package buyItemsTests;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import buyItems.AuthenticationPage;
import buyItems.LoggedInHomePage;
import buyItems.CheckOut;
import buyItems.Dresses;
import buyItems.Orders;
import buyItems.Payment;
import buyItems.PopUp;
import buyItems.Shipping;
import buyItems.TShirts;
import testData.DataFile;
import driverUtilities.DriverUtilities;

import org.junit.Assert;

public class BuyItems {
	
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
		AuthenticationPage.emailAlreadyRegisteredField(driver).sendKeys(DataFile.registeredEmail);
		Assert.assertEquals(DataFile.registeredEmail, AuthenticationPage.emailAlreadyRegisteredField(driver).getAttribute("value"));
		AuthenticationPage.passwordAlreadyRegisteredField(driver).sendKeys(DataFile.registeredPassword);
		Assert.assertTrue(AuthenticationPage.passwordAlreadyRegisteredField(driver).getAttribute("type").equals("password"));
		AuthenticationPage.signInButton(driver).click();	
		Assert.assertEquals(DataFile.loggedInHomePageHeading, LoggedInHomePage.heading(driver).getText());
		LoggedInHomePage.returnRegistered(driver).click();
		
	}
	@Test
	public void buyClothes() throws InterruptedException
	
	{
		//Action Class
		Actions actions	= new Actions(driver);
		
		//Step 1 Click T-Shirts link
		LoggedInHomePage.tShirts(driver);
		Thread.sleep(1500);
		Assert.assertEquals(DataFile.tShirtPageHeading, TShirts.heading(driver));
		
		
		//Step 2 Add a T-Shirt to the cart
		actions.moveToElement(TShirts.hoverItem(driver)).perform();
		TShirts.selectItem(driver,1).click();
		//Assert added to check message "Product successfully added to your shopping cart"
		Thread.sleep(2000); //Allows time for pop up to appear
		Assert.assertEquals(DataFile.tShirtPopUpHeading, PopUp.tShirtPopUpHeading(driver));
		
		
		
		//Step 1 Click T-Shirt link
		
	//Shirts.heading(driver).click();
		//The T-shirt's page is shown
	//ssert.assertEquals(DataFile.tShirtPageHeading, TShirts.heading(driver).getText());
		
		//Step  Hover T-shirt
	//Shirts.hoverItem(driver).click();
		//The T-shirt is added to cart
//Assert.assertEquals(DataFile.tShirtPageHeading, TShirts.hoverItem(driver).getText());
//
		//Step  select t-shirt
//TShirts.selectItem(driver).click();
		//The T-shirt is added to cart
//Assert.assertEquals(DataFile.tShirtPageHeading, TShirts.selectItem(driver).getText());
		
		//Step 2 Pop-Up Message
//PopUp.tShirtPopUpHeading(driver).click();
		//The T-shirt is added to cart
//Assert.assertEquals(DataFile.tShirtPopUpHeading, PopUp.tShirtPopUpHeading(driver).;
		
		
		
		
	}

	@After					
	public void tearDown()
	{ 			
		// Typical functionality is to close the browser after you have finished the test
		driver.quit();
	}
}
