package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Setup;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AppointmentPage;
import pages.ConfirmationPage;

public class Functional_Appointment_TC extends Setup {
	
	
	
	protected WebDriver driver;

	
	  private AppointmentPage appointmentPage;
	    private ConfirmationPage confirmationPage;
	    
	    @BeforeMethod
	    public void loginToApp() throws IOException {
	        appointmentPage = login.login_CURA(username, password);
	    }
	    
	    @Test(priority = 1)
	    public void TC00_VerifyLoginRedirectsToAppointmentPage() throws InterruptedException {
	        //Assert.assertTrue(appointmentPage.isAppointmentPageDisplayed());
	        Assert.assertTrue(appointmentPage.isAppointmentPageDisplayed(), "Appointment page is not displayed");

	    }
	  
	    @Test(priority = 2)
	    public void TC01_BookAppointment_ShouldShowConfirmation() {
	         confirmationPage = appointmentPage.bookAppointment(
	            "Hongkong CURA Healthcare Center",
	            "medicare",
	            "06/07/2025",
	            "Routine checkup"
	        );
	        
	        Assert.assertTrue(confirmationPage.isConfirmationDisplayed(), "Confirmation message should be displayed after booking");
	 
	
	    }}


