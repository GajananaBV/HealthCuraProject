package pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Class.Explicit_waits;

public class LoginPage extends Explicit_waits
{
	
	public WebDriver driver;    //global Variable
	
	
	public  LoginPage (WebDriver driver)  //Constructor 
	{
		super(driver);  //accessing the driver in the Explicit_waits class
		this.driver=driver;   //accessing the driver by uing this
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="txt-username")             //PageFactory
	WebElement userEmail;              //Store the locator in the Variable 
	
	@FindBy(id="txt-password")
	WebElement password;
	
	@FindBy(id="btn-login")
	WebElement loginButton;
	
	@FindBy(id="btn-make-appointment")
	WebElement makeappointment;
	
@FindBy(xpath="//p[text()='Login failed! Please ensure the username and password are valid.']")
WebElement errorMsg;
	
	public AppointmentPage login_CURA(String Email,String PWD) throws IOException
	
	{
	
		
		waitAppearElement(userEmail);  //wait untill the Element visible
		userEmail.sendKeys(Email);
		password.sendKeys(PWD);
		loginButton.click();
		
		
		AppointmentPage apt=new AppointmentPage(driver); //access the AppointmentPage once login action done 
		return apt;
	}
	
	public WebElement ErrorMsg() {
	   // waitAppearElement(errorMsg);  // Wait for it to appear
	    return errorMsg;
	}
	  public String getLoginErrorMessage() {
	        return errorMsg.getText();
	    }
}
