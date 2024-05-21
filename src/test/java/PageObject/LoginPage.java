package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	;
@FindBy(id="Email")
WebElement Email;
@FindBy(id="Password")	
WebElement Password;
@FindBy(xpath = "//button[@type=\"submit\"]")	
WebElement clickbtn;
@FindBy(xpath="//a[contains(@href, '/logout')]")	
WebElement logout;
public String getPageTitle()
{
	return ldriver.getTitle();
}
public void EnterEmail(String email){
	Email.clear();
	Email.sendKeys(email);
	}
public void EnterPassword(String password){
	Password.clear();
	Password.sendKeys(password);
	}
public void ClickButton(){
	clickbtn.click();
	}
public void Logout(){
	logout.click();
	}
}
