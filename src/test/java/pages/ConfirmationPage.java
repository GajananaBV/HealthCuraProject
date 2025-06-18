package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Class.Explicit_waits;

public class ConfirmationPage extends Explicit_waits {
	
	WebDriver driver;
public ConfirmationPage (WebDriver driver)
{
	super(driver);
	this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy( xpath="//h2[text()='Appointment Confirmation']")
WebElement isDislyedConfirmation;

@FindBy( xpath="//p[text()='Please be informed that your appointment has been booked as following:']")
WebElement ConfirmationMasg;

@FindBy( xpath="//a[text()='Go to Homepage']")
WebElement goToHomepage;


public boolean isConfirmationDisplayed() {
	WebDriverWait waitHeader = new WebDriverWait(driver, Duration.ofSeconds(20));
    waitHeader.until(ExpectedConditions.visibilityOf(isDislyedConfirmation));
    return isDislyedConfirmation.isDisplayed();
}

public void goToHomepage()
{
	
	goToHomepage.click();
}
}



