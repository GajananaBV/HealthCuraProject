package tests;

import org.testng.annotations.BeforeMethod;

import base.Setup;
import java.io.IOException;
import org.testng.Assert;

public class LoginNegativeTest extends Setup {
	
	@BeforeMethod
	  public void TC_03_Login_WithInvalidCredentials_ShouldShowErrorMessage() throws IOException
	  {
		 
		   login.login_CURA(InvalidUsername, InvalidPassword);
		  Assert.assertTrue(login.ErrorMsg().isDisplayed(), "Error message is not displayed for invalid login!");
		  
	  }
	}


