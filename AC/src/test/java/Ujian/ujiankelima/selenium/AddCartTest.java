package Ujian.ujiankelima.selenium;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ujian.ujiankelima.selenium.demoqa.driver.DriverSingleton;
import Ujian.ujiankelima.selenium.demoqa.page.AddCart;
import Ujian.ujiankelima.selenium.demoqa.util.Constants;




public class AddCartTest {
	
	public static WebDriver driver;
	private AddCart cartPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLShop);
		cartPage = new AddCart(); 
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testCartAdd() {
		cartPage.addToCart();
		assertEquals(cartPage.txtMsgCart(), "CART");
	}
}
