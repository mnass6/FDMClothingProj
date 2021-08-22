package buyItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage
{
	private static WebElement element = null;
	
		public static WebElement heading(WebDriver driver)
		{
			return driver.findElement(By.className("page-heading"));
		}
	
	public static WebElement mrTickbox(WebDriver driver)
	{
		element = driver.findElement(By.id("id_gender1"));
		return element;
	}
	
	public static WebElement mrsTickbox(WebDriver driver)
	{
		element = driver.findElement(By.id("id_gender2"));
		return element;
	}

	public static WebElement firstNamePersonalInfoField(WebDriver driver)
	{
		element = driver.findElement(By.id("customer_firstname"));
		return element;
	}

	public static WebElement lastNamePersonalInfoField(WebDriver driver)
	{
		element = driver.findElement(By.id("customer_lastname"));
		return element;
	}

	public static WebElement emailAddressField(WebDriver driver)
	{
		element = driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement passwordField(WebDriver driver)
	{
		element = driver.findElement(By.id("passwd"));
		return element;
	}

	public static WebElement firstNameYourAddressField(WebDriver driver)
	{
		element = driver.findElement(By.id("firstname"));
		return element;
	}
	
	public static WebElement lastNameYourAddressField(WebDriver driver)
	{
		element = driver.findElement(By.id("lastname"));
		return element;
	}
	
	public static WebElement addressField(WebDriver driver)
	{
		element = driver.findElement(By.id("address1"));
		return element;
	}
	
	public static WebElement cityField(WebDriver driver)
	{
		element = driver.findElement(By.id("city"));
		return element;
	}
	
	public static WebElement stateDropDown(WebDriver driver)
	{
		element = driver.findElement(By.id("id_state"));
		return element;
	}
	
	public static WebElement postalCodeField(WebDriver driver)
	{
		element = driver.findElement(By.id("postcode"));
		return element;
	}
	
	public static WebElement mobilePhoneField(WebDriver driver)
	{
		element = driver.findElement(By.id("phone_mobile"));
		return element;
	}
	
	public static WebElement registerButton(WebDriver driver)
	{
		element = driver.findElement(By.id("submitAccount"));
		return element;
	}
}