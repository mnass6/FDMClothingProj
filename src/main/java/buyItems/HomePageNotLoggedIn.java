package buyItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageNotLoggedIn
{
	private static WebElement element = null;

	public static WebElement signInButton(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Sign in"));
		return element;
	}
}