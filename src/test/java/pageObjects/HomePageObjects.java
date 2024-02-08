package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityHelper;

public class HomePageObjects extends UtilityHelper {
public WebDriver lDriver;
List<String> categoryNames;
	
	//Constructor
	public HomePageObjects(WebDriver rDriver){
		super(rDriver);
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	//Locators
	
	@FindBy (xpath = "//div[@class='_3sdu8W emupdz']/*")
	List<WebElement> HomePageCategories;
	
	
	//below piece of locator is not following page factory.
	By categories = By.xpath("//div[@class='_3sdu8W emupdz']/*");
	
	
	
	//Methods
	public boolean isHomeScreenDisplayed() {
		waitForElementToAppear(categories);
		if(HomePageCategories.get(1).isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public List<String> getCategoriesList()
	{
		for(WebElement a: HomePageCategories)
		{
			categoryNames.add(a.getText());
		}
		return categoryNames;
	}

}
