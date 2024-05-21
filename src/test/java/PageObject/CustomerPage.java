package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	
	WebDriver ldriver;
	
	public CustomerPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	};
	
@FindBy(xpath  = "//a[@href='#']//p[contains(text(),'Customers')]")
WebElement customerMenu;
@FindBy(xpath  = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
WebElement customerMenuItem;
@FindBy(xpath  = "//a[@href='/Admin/Customer/Create']")
WebElement addcustomer;
@FindBy(xpath  = "//h1[contains(@class, 'float-left')]")
WebElement addcustomercheck;
@FindBy(xpath = "//input[@id='Email']")
WebElement txtEmail;
@FindBy(xpath = "//input[@id='Password']")
WebElement txtPassword;
@FindBy(xpath = "//input[@id='FirstName']")
WebElement txtFirstName;
@FindBy(xpath = "//input[@id='LastName']")
WebElement txtLastName;
@FindBy(id = "Gender_Male")
WebElement MaleGender;
@FindBy(id = "Gender_Female")
WebElement FeMaleGender;
@FindBy(xpath = "//input[@id='DateOfBirth']")
WebElement txtDob;
@FindBy(xpath = "//input[@id='Company']")
WebElement txtCompany;
@FindBy(xpath = "//input[@id='IsTaxExempt']")
WebElement IsTax_Exempt;
@FindBy(xpath = "//*[@id='SelectedNewsletterSubscriptionStoreIds']/option[1]")
WebElement yourstorename;
@FindBy(xpath = "//*[@id='SelectedNewsletterSubscriptionStoreIds']/option[2]")
WebElement teststore2;
@FindBy(xpath = "//input[@id='Active']")
WebElement active;
@FindBy(xpath = "//*[@id='AdminComment']")
WebElement AdminComment;
@FindBy(xpath = "//form/div[1]/div/button[1]")
WebElement save;
@FindBy(xpath = "//div[contains(@class, 'alert alert-success alert-dismissable')]")
WebElement message;
@FindBy(xpath = "//*[@id='SearchEmail']")
WebElement searchemail;
@FindBy(xpath = "//*[@id=\"search-customers\"]")
WebElement searchbtn;
@FindBy(xpath = "//*[@id=\"customers-grid\"]/tbody")
WebElement searchresult;

public void CustomerMenu(){
	customerMenu.click();
	}
public void CustomerMenuItem(){
	customerMenuItem.click();
	}
public void AddCustomer(){
	addcustomer.click();
	}

public String Addcustomercheck(){
	  return addcustomercheck.getText();
	}
public void Entermail(String email){
	txtEmail.clear();
	txtEmail.sendKeys(email);
	}
public void Enterpwd(String pwd){
	txtPassword.clear();
	txtPassword.sendKeys(pwd);
	}
public void EnterFirstName(String FirstName){
	txtFirstName.clear();
	txtFirstName.sendKeys(FirstName);
	}
public void EnterLastName(String LastName){
	txtLastName.clear();
	txtLastName.sendKeys(LastName);
	}

public void Gender(String gender){
	
	if(gender == "Female")
	{FeMaleGender.click();}
	else if (gender == "Male")
	{MaleGender.click();}
	else 
	{MaleGender.click();}
}
public void EnterDob(String Dob){
	txtDob.clear();
	txtDob.sendKeys(Dob);
	}
public void EnterCampany(String Company){
	txtCompany.clear();
	txtCompany.sendKeys(Company);
	}
public void PressIsTax_Exempt(){
	IsTax_Exempt.click();
	}
public void Newsletter(String nletter){
	
	if(nletter == "Your store name")
	{yourstorename.click();}
	else if (nletter == "Test store 2")
	{teststore2.click();}
	else 
	{yourstorename.click();}
}
public void Pressactive(){
	active.click();
	}
public void EnterAdminComment(String Comment){
	AdminComment.clear();
	AdminComment.sendKeys(Comment);
	}
public String Msg(){
	return message.getText();
	}
public void Save(){
	save.click();
	}
}
