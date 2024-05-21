package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductAddSearch {
	 WebDriver ldriver;
	
	public ProductAddSearch(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
@FindBy(id="Email")
WebElement Email;
@FindBy(id="Password")	
WebElement Password;
@FindBy(xpath = "//button[@type=\"submit\"]")	
WebElement clickbtn;
@FindBy(xpath  = "//a[@href='#']//p[contains(text(),'Catalog')]")
WebElement categoriesMenu;
@FindBy(xpath  = "//a[@href='/Admin/Product/List']//p[contains(text(),'Products')]")
WebElement categoriesMenuItem;
@FindBy(xpath  = "//a[contains(@class, 'btn btn-primary')]")
WebElement AddProduct;	
@FindBy(xpath  = "//input[@name=\"Name\"]")
WebElement nameproduct;
@FindBy(xpath  = "//input[@aria-activedescendant]")
WebElement productcategorie;
@FindBy(xpath  = "//input[@name=\"Price\"]")
WebElement productprice;
@FindBy(xpath  = "//*[@data-gtm-form-interact-field-id=\"1\"]")
WebElement preordervisibility;
@FindBy(xpath  = "//input[@name=\"PreOrderAvailabilityStartDateTimeUtc\"]")
WebElement preorderdate;
@FindBy(xpath  = "//*[@id='product-form']/div[1]/div[1]/button[1]/i[1]")
WebElement Save;

public void EnterEmail(String email){
	Email.clear();
	Email.sendKeys(email);
	}
public void EnterPassword(String password){
	Password.clear();
	Password.sendKeys(password);
	}
public void ProductMenu(){
	categoriesMenu.click();
	}
public void ProductMenuItem(){
	categoriesMenuItem.click();
	}
public void Productadd(){
	AddProduct.click();
	}
public void EnterProductName(String name){
	nameproduct.clear();
	nameproduct.sendKeys(name);
	}
public void EnterProductCategorie(){
	productcategorie.click();
	}
public void EnterProductPrice(float productprix){
	productprice.clear();
	productprice.sendKeys(String.valueOf(productprix));
	}
public void EnterPreorder(){
	preordervisibility.click();
	}
public void EnterPreorderDate(String preorder){
	preorderdate.clear();
	preorderdate.sendKeys(preorder);
	}
public void ClickButton(){
	clickbtn.click();
	}
public void ClickSaveButton(){
	Save.click();
	}
}
