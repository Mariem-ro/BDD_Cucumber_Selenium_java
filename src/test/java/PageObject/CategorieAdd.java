package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategorieAdd {
WebDriver ldriver;
	
	public CategorieAdd(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
	
	

	
	@FindBy(xpath  = "//a[@href='/Admin/Category/List']//p[contains(text(),'Categories')]")
	WebElement categorimenuitem;
	@FindBy(xpath = "//a[@href=\"/Admin/Category/Create\"]")	
	WebElement categorieadd;
	@FindBy(id="Name")
	WebElement Name;
	@FindBy(id="advanced-settings-mode")
	WebElement enable;
	@FindBy(xpath = "//input[@type=\"file\"]")	
	WebElement uploadIMAGE;
	@FindBy(xpath  = "//*[@role=\"navigation\"]")
	WebElement Uploadfile;
	@FindBy(xpath  = "//button[@name=\"save\"]")
	WebElement saveit;
	@FindBy(xpath  = "//h1[contains(@class, 'float-left')]")
	WebElement check;
	public String getPageTexe()
	{
		return check.getText();
	}
	
	public void Categorimenuitem(){
		categorimenuitem.click();
		}
	public void Categoriadd(){
		categorieadd.click();
		}
	public void EnterName(String name){
		Name.clear();
		Name.sendKeys(name);
		}

	public void Enable(){
		enable.click();
		}
//	public void Uploadimage(String path){
//		path = "path of the image";
//		uploadIMAGE.clear();
//		uploadIMAGE.sendKeys(path);
//		}
//	public void Uploadfile(){
//		Uploadfile.click();
//		}
	public void EnterProductCategorie(){
		saveit.click();
		}
}
