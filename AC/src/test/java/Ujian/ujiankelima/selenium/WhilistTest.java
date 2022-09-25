package Ujian.ujiankelima.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ujian.ujiankelima.selenium.demoqa.driver.DriverSingleton;
import Ujian.ujiankelima.selenium.demoqa.page.Whishlist;
import Ujian.ujiankelima.selenium.demoqa.util.Constants;



public class WhilistTest {
	
	public static WebDriver driver;
	private Whishlist wishlistPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLShop);
		wishlistPage = new Whishlist(); 
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testAddWishlist() {
		wishlistPage.Wishlist();
		assertEquals(wishlistPage.getTxtWishlist(), "PRODUCT NAME");
	}

}
