package testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageObjects;
import testComponents.TestBase;

public class TrialClass extends TestBase {
	
	@Test (groups= {"Smoke"})
	public void testHomePageVisibility() throws IOException
	 {
		// TODO Auto-generated method stub
		HomePageObjects hpo = launchApplication();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://www.flipkart.com");
		//driver.manage().window().maximize();
		
		//HomePageObjects hpo = new HomePageObjects(driver);
		System.out.print(hpo.isHomeScreenDisplayed());
		
		System.out.println(hpo.getCategoriesList());
		
		Assert.assertTrue(true);

	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {{"laptop"},{"mobile"},{"Toy"}};
	}
	
	@Test(dataProvider = "getData")
	public void testSearchFunctionality(String searchText)
	{
		
	}

}
