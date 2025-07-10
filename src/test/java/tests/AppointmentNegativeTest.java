package tests;

import org.testng.annotations.Test;

import base.Setup;
import org.testng.Assert;
import pages.AppointmentPage;
import pages.ConfirmationPage;

public class AppointmentNegativeTest extends Setup {
	
	ConfirmationPage confirmationPage;
	@Test
	public void TC_05_AppointmentWithoutDate_ShouldNotProceed() throws Exception {
	    AppointmentPage appointmentPage = login.login_CURA(username, password);

	    confirmationPage = appointmentPage.bookAppointmentWithoutDate(
	            "Hongkong CURA Healthcare Center", "Medicare", "", "No date provided test");

	    Assert.assertFalse(confirmationPage.isConfirmationDisplayed(),
	            "Confirmation should not appear without a date");
	}}
