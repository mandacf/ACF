package Latihan.silenium.demoQA;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Training.silenium.demoQA.drivers.DriverSingleton;
import Training.silenium.demoQA.pages.forms.PracticeForm;
import Training.silenium.demoQA.util.Constants;


public class TestPracticeForm {
	public static WebDriver driver;
	private PracticeForm praticeForm;
	

	@BeforeMethod
	public void pageTextArea() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		praticeForm = new PracticeForm();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testInputForm() throws InterruptedException, AWTException{
		praticeForm.PraticeFormPage("Alamanda","cathartica", "cat@gmail.com", "085664992027", "12/04/1999" , "Maths" , "Jln.Srijaya");
	}

}
