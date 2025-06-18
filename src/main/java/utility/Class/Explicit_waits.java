package utility.Class;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_waits
{
	WebDriver driver;
	
	protected Explicit_waits (WebDriver driver)
	{
		super();
		this.driver=driver;
	}
	
	
	public void waitAppearElement(WebElement FindBy)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(FindBy));
		
		
	}
	
	
	
}
