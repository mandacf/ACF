package Latihan.silenium.demoQA;



import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Training.silenium.demoQA.drivers.DriverSingleton;
import Training.silenium.demoQA.pages.amazon.Amazonaws;
import Training.silenium.demoQA.util.Constants;

public class TestFormAmazon {
		public static WebDriver driver;
		private Amazonaws amazon;
		

		@BeforeMethod
		public void pageAmazon() {
			DriverSingleton.getInstance(Constants.CHROME);
			driver = DriverSingleton.getDriver();
			driver.get(Constants.URLAMAZON);
			amazon = new Amazonaws();
		}
		
		@AfterMethod
		public void closeBrowser() throws InterruptedException {
			Thread.sleep(3000);
			DriverSingleton.closeObjectInstance();
		}
		
		@Test
		public void testInputForm() throws InterruptedException{
			amazon.FormAmazonPage("Alamanda", "Cathartica", "12/04/1999", "jln srijaya", "cathartica@gmail.com", "PT.Paradamaksa", "pasti bisa", "1234");
			assertEquals(amazon.getTxtMsg(), "Successfully submitted!");
		}

	}


