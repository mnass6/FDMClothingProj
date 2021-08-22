package buyItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUp {
	private static WebElement element = null;
	
	//Step 2
	
	public static String tShirtPopUpHeading(WebDriver driver)
	{
	return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")).getAttribute("innerText");
	}
	
	//For Step 3 Click Continue Shopping
		public static WebElement continueShopping(WebDriver driver)
		{
			element = driver.findElement(By.linkText("Continue shopping"));
			return element;
		}

}