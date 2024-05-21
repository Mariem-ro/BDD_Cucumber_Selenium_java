package StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.CustomerPage;
import PageObject.LoginPage;
import PageObject.SearchCustmerPage;
import Utilities.ReadConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthStep extends BaseClass{
	public WebDriver driver;

	public static Logger log;
	
	public LoginPage Lgpage;

	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		log = LogManager.getLogger("StepDef");
		ReadConfig = new ReadConfig();
        String browser = ReadConfig.getBrowser();
		
		//launch browser
		switch(browser.toLowerCase())
		{
		case "chrome":
			ChromeOptions options = new ChromeOptions();
		    options.setHeadless(false);
		    options.setCapability("browserVersion", "124.0.6367.208");
		    options.addArguments("start-maximized"); // open Browser in maximized mode
			driver = new ChromeDriver(options);
			break;

		case "msedge":
			driver = new EdgeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;
		}
		
		Lgpage = new LoginPage(driver);
		log.info("browser launched");
	
	}

	@When("User opens URL")
	public void user_opens_url() {
		String url = ReadConfig.getUrl();
		driver.get(url);
		log.info("open url");
	}

	@When("User enters Email and Password")
	public void user_enters_email_as_and_password_as() {
		String mail = ReadConfig.getEmail();
		String pwd = ReadConfig.getPassword();
		Lgpage.EnterEmail(mail);
		Lgpage.EnterPassword(pwd);
		log.info("enter user credentials");
	}

	@When("Click on Login")
	public void click_on_login() {
		Lgpage.ClickButton();
		log.info("click on login button");
	
	}

//	@Then("Page Title should be {string}")
//	public void page_title_should_be(String expectedtitle) {
//		String Actualtitle = Lgpage.getPageTitle();
//		if (expectedtitle.equals(Actualtitle))
//		{   
//			log.info("expected title of webpage not the same as current page");
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			log.warn("expected title of webpage is the same as current page");
//			Assert.assertTrue(false);
//		}
//
//	}	
	@Then("logout")
	public void logout() {
		Lgpage.Logout();
	}
    
	
	@Then("Close Browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	}

}
