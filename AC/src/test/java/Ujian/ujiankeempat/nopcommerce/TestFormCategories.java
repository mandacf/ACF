package Ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;
import Ujian.ujiankeempat.nopcommerce.page.FormCategories;
import Ujian.ujiankeempat.nopcommerce.util.Constants;

public class TestFormCategories {
	
	public static WebDriver driver;
	private FormCategories formCategories;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URLNop);
		formCategories = new FormCategories();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test(priority=0)
	public void testSearchCategories()throws InterruptedException {
		formCategories.FormCategoriesPage("Computers");
		assertEquals(formCategories.getTxtSearchCom(), "Computers");
//		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
	@Test(priority=1)
	public void testSearchInvalCategories()throws InterruptedException {
		formCategories.FormCategoriesPage("Pakaian");
		assertEquals(formCategories.getTxtSearchEmpty(), "No data available in table");
//		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}

}
