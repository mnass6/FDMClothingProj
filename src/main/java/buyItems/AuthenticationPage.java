package buyItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPage
{
	private static WebElement element = null;
	
	public static String authenticationURL = "http://automationpractice.com/index.php?controller=authentication";
	
	public static WebElement heading(WebDriver driver)
	{
		return driver.findElement(By.className("page-heading"));
	}

	public static WebElement emailField(WebDriver driver)
	{
		element = driver.findElement(By.id("email_create"));
		return element;
	}

	public static WebElement createAccountButton(WebDriver driver)
	{
		element = driver.findElement(By.name("SubmitCreate"));	
		return element;
	}
	
	public static WebElement emailAlreadyRegisteredField(WebDriver driver)
	{
		element = driver.findElement(By.id("email"));
		return element;
	}

	public static WebElement passwordAlreadyRegisteredField(WebDriver driver)
	{
		element = driver.findElement(By.name("passwd"));	
		return element;
	}
	
	public static WebElement signInButton(WebDriver driver)
	{
		element = driver.findElement(By.id("SubmitLogin"));	
		return element;
	}
	
	public static WebElement forgotPasswordButton(WebDriver driver) {
		return driver.findElement(By.partialLinkText("Forgot"));
	}
}