package tests;

import java.util.List;

import org.testng.annotations.Test;

import base.Setup;
import org.testng.Assert;
import pages.AppointmentPage;

public class DropdownValidationTest extends Setup {
	private AppointmentPage appointmentPage;
	
    @Test
    public void TC_06_ValidateHealthcareCenterDropdownOptions() throws Exception {
        appointmentPage = login.login_CURA(username, password);
        List<String> options = appointmentPage.getFacilityDropdownOptions();
        Assert.assertTrue(options.contains("Tokyo CURA Healthcare Center"));
        Assert.assertTrue(options.contains("Hongkong CURA Healthcare Center"));
        Assert.assertTrue(options.contains("Seoul CURA Healthcare Center"));
    }
}
