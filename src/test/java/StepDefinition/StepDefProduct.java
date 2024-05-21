package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.AddSearchManufacturers;
import PageObject.CategorieAdd;
import PageObject.CustomerPage;
import PageObject.ProductAddSearch;
import PageObject.SearchCustmerPage;
import Utilities.ReadConfig;

public class StepDefProduct extends BaseClass{
	public ProductAddSearch Ppage;
	public CategorieAdd Catpage;
	public AddSearchManufacturers Manpage;
	private final AuthStep commonSteps;
	public static Logger log;
	public StepDefProduct(AuthStep commonSteps) {
	    this.commonSteps = commonSteps;
	    WebDriver driver = commonSteps.driver;
	    Logger log = commonSteps.log;
	    Ppage = new ProductAddSearch(driver);
	    Catpage = new CategorieAdd(driver);
	    Manpage = new AddSearchManufacturers(driver);
	    }

	@When("User click on Product menu")
	public void user_click_on_product_menu() {
		Ppage.ProductMenu();
	}

	@When("User click on product menu item")
	public void user_click_on_product_menu_item() {
		Ppage.ProductMenuItem();
	}

	@When("User click on add new product")
	public void user_click_on_add_new_product() {
		Ppage.Productadd();
	}

	@Then("Page with Add user form appear")
	public void page_with_add_user_form_appear() {
		
	}

	@When("User enter Product information")
	public void user_enter_product_information() {
		Ppage.Productadd();
		Ppage.EnterProductName("iphone 11 Pro");
		Ppage.EnterProductCategorie();
		Ppage.EnterProductPrice(50);
		Ppage.EnterPreorder();
		Ppage.EnterPreorderDate("20/05/2024 11:00");

	}

	@When("click on save button")
	public void click_on_save_button() {
		Ppage.ClickSaveButton();
	}
//
//	@Then("sucess message will appear")
//	public void sucess_message_will_appear() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
	@When("User click on categorie menu item")
	public void user_click_on_categorie_menu_item() {
		Catpage.Categorimenuitem();
	 
	}

	@When("User click on add new gategorie")
	public void user_click_on_add_new_gategorie() {
		Catpage.Categoriadd();
	}

	@Then("Page with Add gategorie form appear")
	public void page_with_add_gategorie_form_appear(String expectedtitle) {
		String currenttitle = Catpage.getPageTexe();
        if (currenttitle.contains("Categories"))
			
		{
			log.info("we are in desired page");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			log.warn("we are not in add categorie page");
		}
	}

	@When("User enter gategorie information")
	public void user_enter_gategorie_information() {
		Catpage.Enable();
		Catpage.EnterName("it");
		
	    
	}
	@When("click on save gategorie button")
	public void click_on_save_gategorie_button() {
		Catpage.EnterProductCategorie();
	}

	@When("User click on Manufactures menu item")
	public void user_click_on_manufactures_menu_item() {
		Manpage.Manufacturersmenuitem();
	}

	@When("User click on add new Manufacture")
	public void user_click_on_add_new_manufacture() {
		Manpage.Manufacturersadd();
	}

	@Then("Page with Add Manufactures form appear")
	public void page_with_add_manufactures_form_appear() {
		Manpage.EnterName("huawei");
	}

	@When("User enter Manufacture information")
	public void user_enter_manufacture_information() {
		Manpage.Save();
	}
	
	@When("User enter Manufacture name")
	public void user_enter_manufacture_name() {
		Manpage.Entertext("huawei");
	}

	@Then("Manufacture informations will appear")
	public void manufacture_informations_will_appear() {
		Manpage.SearchManufactor();
	}
//
//	@When("User enter product name")
//	public void user_enter_product_name() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User click on search")
//	public void user_click_on_search() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("product informations will appear")
//	public void product_informations_will_appear() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User click on Manufacture menu item")
//	public void user_click_on_manufacture_menu_item() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}



}
