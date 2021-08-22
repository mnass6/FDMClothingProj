package buyItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dresses {

	private static WebElement element = null;
	
	//Dresses page button
	public static WebElement dresses(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));
		return element;
	}

}
