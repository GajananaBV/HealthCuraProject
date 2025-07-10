package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.HomePage;
import pages.LoginPage;
import resources.ConfigureReaderFile;

public class Setup 

{
	
	public  WebDriver driver;
	protected LoginPage login;
	protected String username;
	protected String password ;
	protected String InvalidUsername;
	protected String InvalidPassword ;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() {
	    String browser = ConfigureReaderFile.getProperty("browser");

	    if (browser.equalsIgnoreCase("chrome")) {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    } else if (browser.equalsIgnoreCase("edge")) {
	        WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
	    } else {
	        System.out.println("Browser not supported");
	    }

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.manage().window().maximize();
	    driver.get(ConfigureReaderFile.getProperty("baseURL"));

	    HomePage home = new HomePage(driver);
	    home.makePointButton();

	    login = new LoginPage(driver);
	    username = ConfigureReaderFile.getProperty("username");
	    password = ConfigureReaderFile.getProperty("password");
	    InvalidUsername = ConfigureReaderFile.getProperty("InvalidUsername");
	    InvalidPassword = ConfigureReaderFile.getProperty("InvalidPassword");
	}
	public String TakeScreenShott(String TCName,WebDriver driver) throws IOException
	{
		TakesScreenshot SS = (TakesScreenshot)driver;
		File Source = SS.getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+"//reports//"+TCName+".png");
		FileUtils.copyFile(Source,  file);
		return System.getProperty("user.dir")+"//reports//"+TCName+".png";
	}
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
	    if (driver != null) {
	        driver.quit(); // Better than close() to fully shut down
	    }
	}
	
	
}
	
	
	
	
	
	
	

