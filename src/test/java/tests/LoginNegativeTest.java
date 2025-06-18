package tests;

import org.testng.annotations.Test;

import base.Setup;
import java.io.IOException;
import org.testng.Assert;

public class LoginNegativeTest extends Setup {
	
	 @Test
	  public void TC_03_Login_WithInvalidCredentials_ShouldShowErrorMessage() throws IOException
	  {
		 
		   login.login_CURA(InvalidUsername, InvalidPassword);
		  Assert.assertTrue(login.ErrorMsg().isDisplayed(), "Error message is not displayed for invalid login!");
		  
	  }
	}


