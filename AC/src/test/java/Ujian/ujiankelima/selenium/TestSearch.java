package Ujian.ujiankelima.selenium;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ujian.ujiankelima.selenium.demoqa.driver.DriverSingleton;
import Ujian.ujiankelima.selenium.demoqa.page.SearchType;
import Ujian.ujiankelima.selenium.demoqa.util.Constants;

public class TestSearch {
	
	public static WebDriver driver;
	private SearchType searchPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLShop);
		searchPage = new SearchType(); 
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testSearchProduct() throws AWTException {
		searchPage.Search("BLACK CROSS BACK MAXI DRESS");
		assertEquals(searchPage.txtMsgSear(), "BLACK CROSS BACK MAXI DRESS"); 
	}

}
