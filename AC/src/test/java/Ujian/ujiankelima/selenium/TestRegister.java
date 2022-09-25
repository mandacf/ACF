package Ujian.ujiankelima.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ujian.ujiankelima.selenium.demoqa.driver.DriverSingleton;
import Ujian.ujiankelima.selenium.demoqa.page.RegisterPage;
import Ujian.ujiankelima.selenium.demoqa.util.Constants;


public class TestRegister {
	
	public static WebDriver driver;
	private RegisterPage registerPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLREGIST);
		registerPage = new RegisterPage(); 
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testInvalidRegister() {
		registerPage.registerInvalid("manda", "manda@gmail.com", "12345");
		assertEquals(registerPage.TxtInvalid(), "Error: An account is already registered with your email address. Please log in.");
	}
	
	

}
