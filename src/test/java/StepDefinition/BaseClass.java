package StepDefinition;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.*;
import PageObject.CustomerPage;
import PageObject.LoginPage;
import PageObject.SearchCustmerPage;
import Utilities.ReadConfig;
public class BaseClass {
	public WebDriver driver;
	public LoginPage Lgpage;
	public CustomerPage Custpage;
	public SearchCustmerPage SearchCP;
	public static Logger log;
	public ReadConfig ReadConfig;
	public String generateEmailId()
	{
		return(RandomStringUtils.randomAlphabetic(10));
	}

}
