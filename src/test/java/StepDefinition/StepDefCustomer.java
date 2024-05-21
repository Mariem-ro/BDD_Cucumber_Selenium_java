package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.CustomerPage;
import PageObject.LoginPage;
import PageObject.ProductAddSearch;
import PageObject.SearchCustmerPage;
import Utilities.ReadConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefCustomer extends BaseClass{
    private final AuthStep commonSteps;
    public CustomerPage Custpage;
    public SearchCustmerPage SearchCP;
    public static Logger log;
    public StepDefCustomer(AuthStep commonSteps) {
        this.commonSteps = commonSteps;
        WebDriver driver = commonSteps.driver;
        Logger log = commonSteps.log;
		Custpage = new CustomerPage(driver);
		SearchCP = new SearchCustmerPage(driver);
    }
//	public WebDriver driver;
//	public LoginPage Lgpage;
//	public CustomerPage Custpage;
//	public SearchCustmerPage SearchCP;
	
//	@BeforeStep
//	public void Beforestep() {
//		System.out.println("before step");	}
//	@Before("@regression")
//	public void Setup() {
//		System.out.println("before regression");
////		ChromeOptions options = new ChromeOptions();
////	    options.setHeadless(false);
////	    options.setCapability("browserVersion", "124");
////	    options.addArguments("start-maximized"); // open Browser in maximized mode
////	    options.addArguments("disable-infobars"); // disabling infobars
////	    options.addArguments("--disable-extensions"); // disabling extensions
////	    options.addArguments("--disable-gpu"); // applicable to Windows os only
////	    options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
////	    options.addArguments("--no-sandbox"); // Bypass OS security model
////	    options.addArguments("--disable-in-process-stack-traces");
////	    options.addArguments("--disable-logging");
////	    options.addArguments("--log-level=3");
////	    options.addArguments("--remote-allow-origins=*");
////		driver = new ChromeDriver(options);
//	}
	
//	@Given("User Launch Chrome browser")
//	public void user_launch_chrome_browser() {
//		log = LogManager.getLogger("StepDef");
//		ReadConfig = new ReadConfig();
//        String browser = ReadConfig.getBrowser();
//		
//		//launch browser
//		switch(browser.toLowerCase())
//		{
//		case "chrome":
//			ChromeOptions options = new ChromeOptions();
//		    options.setHeadless(false);
//		    options.setCapability("browserVersion", "124");
//		    options.addArguments("start-maximized"); // open Browser in maximized mode
//			driver = new ChromeDriver(options);
//			break;
//
//		case "msedge":
//			driver = new EdgeDriver();
//			break;
//
//		case "firefox":
//			driver = new FirefoxDriver();
//			break;
//		default:
//			driver = null;
//			break;
//		}
//		
//		Lgpage = new LoginPage(driver);
//		Custpage = new CustomerPage(driver);
//		SearchCP = new SearchCustmerPage(driver);
//		log.info("browser launched");
//	
//	}
//
//	@When("User opens URL")
//	public void user_opens_url() {
//		String url = ReadConfig.getUrl();
//		driver.get(url);
//		log.info("open url");
//	}
//
//	@When("User enters Email and Password")
//	public void user_enters_email_as_and_password_as() {
//		String mail = ReadConfig.getEmail();
//		String pwd = ReadConfig.getPassword();
//		Lgpage.EnterEmail(mail);
//		Lgpage.EnterPassword(pwd);
//		log.info("enter user credentials");
//	}
//
//	@When("Click on Login")
//	public void click_on_login() {
//		Lgpage.ClickButton();
//		log.info("click on login button");
//	
//	}
//
//	@Then("Page Title should be {string}")
//	public void page_title_should_be(String expectedtitle) {
//		String Actualtitle = Custpage.getPageTitle();
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

	@When("User click on customers menu")
	public void user_click_on_customers_menu() {
		log = LogManager.getLogger("StepDef");
		Custpage.CustomerMenu();
	}

	@When("Click on showed customers menu item")
	public void click_on_showed_customers_menu_item() {
		Custpage.CustomerMenuItem();
	}

	@When("Click on add new customer link")
	public void click_on_add_new_customer_link() {
		Custpage.AddCustomer();
	}

	@Then("User view customer Add new costumer page")
	public void user_view_customer_add_new_costumer_page() {
		String Actualtitle = Custpage.Addcustomercheck();
		
		if (Actualtitle.contains("Add a new customer"))
			
		{
			log.info("user is aded");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			log.warn("problem happens when user add");
		}
	}

	@When("User Enter form fields")
	public void user_enter_form_fields() {
		Custpage.Entermail(generateEmailId()+"@gmail.com");
		Custpage.Enterpwd("admin");   
		Custpage.EnterFirstName("admin2");
		Custpage.EnterLastName("admin");
		Custpage.EnterDob("04/05/2024");
		Custpage.EnterCampany("campany1");
		Custpage.PressIsTax_Exempt();
		Custpage.Newsletter("Your store name");
		Custpage.EnterAdminComment("*****");
		
	}

	@When("User click on save")
	public void user_click_on_save() {
		Custpage.Save();
		try{
			Thread.sleep(1);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
	}

	@Then("User can view success message")
	public void user_can_view_success_message() {
	    String actualmsg = Custpage.Msg();
	    
	    if (actualmsg.contains("The new customer has been added successfully."))
		{
			
			
				//Convert web driver object to TakeScreenshot

				String fileWithPath = "C:\\Users\\RIMA\\eclipse-workspace\\CucumberFramework\\Screenshots\\hi\\test2.png";
				TakesScreenshot scrShot = ((TakesScreenshot)commonSteps.driver);

				//Call getScreenshotAs method to create image file
				File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

				//Move image file to new destination
				File DestFile=new File(fileWithPath);

				//Copy file at destination
                 
				try {
					FileUtils.copyFile(SrcFile, DestFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	@When("User Email")
	public void user_email() {
		SearchCP.SearchEmail("kiyjcycyhjc676008@gmail.com");
		
    
	}

	@When("User click on search button")
	public void user_click_on_search_button() {
		SearchCP.Search();
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
			}
	}

	@Then("User info will appear")
	public void user_info_will_appear() {
	    String expectedemail = "kiyjcycyhjc676008@gmail.com";
	    Assert.assertTrue(SearchCP.CheckResult(expectedemail));
	 
	}
//	@Then("logout")
//	public void logout() {
//		Lgpage.Logout();
//	}
//    
//	
//	@Then("Close Browser")
//	public void close_browser() {
//		driver.close();
//		driver.quit();
//	}

//	@After("@regression")
//	public void teardown() {
//		System.out.println("After regression step");
//		driver.quit();
//		}
//	
//	@AfterStep
//	public void quit_browser() {
//		System.out.println("After step");	}
	
	
}
