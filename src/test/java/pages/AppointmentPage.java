package pages;

import java.util.List;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Class.Explicit_waits;

public class AppointmentPage extends Explicit_waits {
    WebDriver driver;

    public AppointmentPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "combo_facility")
    WebElement facility;

    @FindBy(id = "chk_hospotal_readmission")
    WebElement applyForHospitalReadmission;

    @FindBy(css = "input[name='programs']") // Fixed the selector (was 'program')
    List<WebElement> healthcareProgramOptions;

    @FindBy(id = "txt_visit_date")
    WebElement date;

    @FindBy(id = "txt_comment")
    WebElement comment;

    @FindBy(id = "btn-book-appointment")
    WebElement BookAppoinment;

    @FindBy(xpath="//h2[text()='Appointment Confirmation']") 
    WebElement appointmentHeader;

    public boolean isAppointmentPageDisplayed() throws InterruptedException {
        
        try {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	wait.until(ExpectedConditions.visibilityOfElementLocated((By) appointmentHeader));

            //WebDriverWait waitHeader = new WebDriverWait(driver, Duration.ofSeconds(5));
            //waitHeader.until(ExpectedConditions.visibilityOf(appointmentHeader));
            return appointmentHeader.isDisplayed();
        } catch (Exception e) {
            System.out.println("Appointment header not found: " + e.getMessage());
            return false;
        }
    }

    public ConfirmationPage bookAppointment(String facilityValue, String programOption, String visitDate,
            String commentText) {
        try {
        	 // Select Facility using Select class
        	Select facilityDropdown = new Select(facility);
        	facilityDropdown.selectByVisibleText(facilityValue);

            // Click hospital readmission checkbox
            waitAppearElement(applyForHospitalReadmission);
            applyForHospitalReadmission.click();
            
            // Select program option (radio buttons)
            waitAppearElement(healthcareProgramOptions.get(0));
            if (programOption != null) {
                switch (programOption.toLowerCase()) {
                    case "medicare":
                        healthcareProgramOptions.get(0).click();
                        break;
                    case "medicaid":
                        healthcareProgramOptions.get(1).click();
                        break;
                    case "none":
                        healthcareProgramOptions.get(2).click();
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid program option: " + programOption);
                }
            }

            // Fill in date and comment
            waitAppearElement(date);
            date.clear();
            date.sendKeys(visitDate);

            waitAppearElement(comment);
            comment.clear();
            comment.sendKeys(commentText);

            // Click book appointment
            waitAppearElement(BookAppoinment);
            BookAppoinment.click();

            return new ConfirmationPage(driver);

        } catch (Exception e) {
            System.out.println("Error booking appointment: " + e.getMessage());
            throw e;
        }
    }
}