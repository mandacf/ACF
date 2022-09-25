package Ujian.ujiankelima.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ujian.ujiankelima.selenium.demoqa.driver.DriverSingleton;
import Ujian.ujiankelima.selenium.demoqa.page.ShowPage;
import Ujian.ujiankelima.selenium.demoqa.util.Constants;

public class TestShowPage {
	
	public static WebDriver driver;
	private ShowPage showPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLShop);
		showPage = new ShowPage(); 
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testShareProduct() {
		showPage.shareProduct();
		assertEquals(showPage.getTxtDetail(), "PINK DROP SHOULDER OVERSIZED T SHIRT");
	}

}
