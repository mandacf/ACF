package tugas.pagefactoryobject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Training.TestObjek.driver.DriverSingleton;
import Training.TestObjek.page.LoginPage;
import Training.TestObjek.util.Constants;



public class TestLogin {

	public static WebDriver driver;
	private LoginPage loginPage;
	
	@BeforeClass
	public void setUp() {
				
	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2500);
		DriverSingleton.closeObjectInstance();
	}
	
	//Positive Case
	@Test
	public void testValidLogin() {
		loginPage.login("Admin", "admin123");
		assertEquals(loginPage.getTxtEmp(), "Employee Information");
	}
	
	@Test
	public void testValidLoginUsernameKapital() {
		loginPage.login("ADMIN", "admin123");
		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
	//Negative Case
	@Test
	public void testInValidLogin() {
		loginPage.login("AdminNexsoft", "admin1234");
		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
	}
	
	@Test
	public void testInValidLoginUsernameSalah() {
		loginPage.login("AdminNexsoft", "admin123");
		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
	}
	
	@Test
	public void testInValidLoginPasswordSalah() {
		loginPage.login("Admin", "admin1234");
		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
	}
	
}
