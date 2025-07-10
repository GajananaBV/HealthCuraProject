package tests;

import org.testng.annotations.Test;

import base.Setup;
import org.testng.Assert;
import pages.AppointmentPage;
import pages.HomePage;

public class LogoutTest extends Setup {
	private AppointmentPage appointmentPage;
	HomePage home;
    @Test
    public void TC_04_Logout_ShouldRedirectToHomePage() throws Exception {
        appointmentPage = login.login_CURA(username, password);
         home = appointmentPage.logout();
        Assert.assertTrue(home.isHomePageDisplayed(), "User should be redirected to Home after logout");
    }
}
