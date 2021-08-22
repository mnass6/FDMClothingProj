package buyItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggedInHomePage
{
	private static WebElement element = null;

	public static WebElement heading(WebDriver driver)
	{
		element = driver.findElement(By.tagName("h1"));
		return element;
	}

	public static WebElement signOutButton(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Sign out"));
		return element;
	}

	public static WebElement returnRegistered(WebDriver driver)
	{
		element = driver.findElement(By.className("home"));
		return element;
	}
	
	public static WebElement customerAccount(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span"));
		return element;
	}
	
	public static WebElement tShirts(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"));
		return element;
	}
	
	public static WebElement orderHistoryLink(WebDriver driver)
	{
		
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span"));
	}

}