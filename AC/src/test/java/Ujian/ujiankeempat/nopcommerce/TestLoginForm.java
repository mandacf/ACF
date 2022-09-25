package Ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import Ujian.ujiankeempat.nopcommerce.page.FormLogin;
import Ujian.ujiankeempat.nopcommerce.util.Constants;


public class TestLoginForm {
	
	public static WebDriver driver;
	private FormLogin formPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLNop);
		formPage = new FormLogin();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test(priority=0)
	public void testValidLogin()throws InterruptedException {
		formPage.FormLoginPage("", "");
		assertEquals(formPage.getTxtDashboard(10), "Dashboard");
//		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
	@Test(priority=1)
	public void testInValidLogin()throws InterruptedException {
		formPage.FormLoginDua("manda@gmail.com", "admin");
		assertEquals(formPage.getTxtAccount(10), "No customer account found");
	}
	
	@Test(priority=2)
	public void testInValidLoginDua()throws InterruptedException {
		formPage.FormLoginTiga("", "admin");
		assertEquals(formPage.getTxtemail(), "Please enter your email");
	}
	
	@Test(priority=3)
	public void testInValidLoginKetiga()throws InterruptedException {
		formPage.FormLoginEmpat( "123");
		assertEquals(formPage.getTxtIncorrect(), "The credentials provided are incorrect");
	}
	

}
