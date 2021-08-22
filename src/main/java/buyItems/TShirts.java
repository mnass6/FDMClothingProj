package buyItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TShirts {
		
	private static WebElement element = null;
	

	public static WebElement heading(WebDriver driver) //checking your in the right page
	{
		return driver.findElement(By.className("cat-name"));
		
	}

	
	// How to create hover item method??
	public static WebElement hoverItem(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
	}
	
	//For Step 2 Add a T-shirt to the cart
	public static WebElement selectItem(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]"));
		return element;
	}

	
}