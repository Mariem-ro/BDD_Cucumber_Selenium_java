package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSearchManufacturers {
WebDriver ldriver;
	
	public AddSearchManufacturers(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath  = "//a[@href=\"/Admin/Manufacturer/List\"]")
	WebElement Manufacturers_menu_item;
	@FindBy(xpath = "//a[@href=\"/Admin/Manufacturer/Create\"]")	
	WebElement Manufacturers_add;
	@FindBy(id="Name")
	WebElement Name;
	@FindBy(xpath  = "//button[@name=\"save\"]")
	WebElement save_button;
	@FindBy(id = "SearchPublishedId")	
	WebElement input_name;
	@FindBy(xpath  = "//*[@id=\"search-manufacturers\"]")
	WebElement search_button;

	
	public void Manufacturersmenuitem(){
		Manufacturers_menu_item.click();
		}
	public void Manufacturersadd(){
		Manufacturers_add.click();
		}
	public void EnterName(String name){
		Name.clear();
		Name.sendKeys(name);
		}
	public void Save(){
		save_button.click();
		}
	public void Entertext(String name){
		input_name.clear();
		input_name.sendKeys(name);
		}
	public void SearchManufactor(){
		search_button.click();
		}

}
