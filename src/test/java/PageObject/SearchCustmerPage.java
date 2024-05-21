package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustmerPage {
WebDriver ldriver;
	
	public SearchCustmerPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

};

@FindBy(xpath = "//*[@id='SearchEmail']")
WebElement searchemail;
@FindBy(xpath = "//*[@id=\"search-customers\"]")
WebElement searchbtn;
@FindBy(xpath = "//*[@id=\"customers-grid\"]/tbody/tr")
List<WebElement> tableRows;
@FindBy(xpath = "//*[@id=\"customers-grid\"]/tbody/tr[1]/td")
List<WebElement> tableColumns;

public void SearchEmail(String email){
	searchemail.clear();
	searchemail.sendKeys(email);
	}
public void Search(){
	searchbtn.click();
	}
public boolean CheckResult(String email){
	
	boolean found = false;

	//total no. of rows in a grid
	int ttlRows = tableRows.size();


	for(int i=1;i<=ttlRows;i++)//to iterate all the rows of the grid
	{
		WebElement webElementName = ldriver.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[" + i  + "]/td[2]"));
		String actualName = webElementName.getText();

		if(actualName.equals(email))
		{
			found=true;
			break;
		}


	}

	return found;

	}
			
}