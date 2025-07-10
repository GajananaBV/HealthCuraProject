package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
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


@FindBy( xpath="//a[text()='Go to Homepage']")
WebElement goToHomepage;


public boolean isConfirmationDisplayed() {
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirmationHeader = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Appointment Confirmation']"))
        );
        return confirmationHeader.isDisplayed();
    } catch (TimeoutException | NoSuchElementException e) {
        System.out.println("Confirmation not displayed (expected for negative test): " + e.getMessage());
        return false;
    }
}


public void goToHomepage()
{
	
	goToHomepage.click();
}
}



