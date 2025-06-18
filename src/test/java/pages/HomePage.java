package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Class.Explicit_waits;

public class HomePage extends Explicit_waits {
	WebDriver driver;
	public HomePage (WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="btn-make-appointment")
	WebElement makeappointment;
	
	
	
	public void makePointButton()
	{
		waitAppearElement(makeappointment);
		if(makeappointment.isDisplayed()) 
		{
		
		makeappointment.click();
		}	
		
	}
	
	
	
	
	
	

}
