package Latihan.cucumber.framework.demoqa;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Training.silenium.demoQA.drivers.DriverSingleton;
import Training.silenium.demoQA.skenariotest.HRMSSceneLogin;
import Training.silenium.demoQA.util.Constants;
import Training.silenium.demoQA.util.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SceneFirstHooks {
	
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/hrms/extentreport/hrms-scene-login-xr.html");

	@Before
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		HRMSSceneLogin[] tests = HRMSSceneLogin.values();
		extentTest = reports.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, "HRMS_SceneFirstHooks"+scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));;
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	
	@AfterAll
	public static void closeBrowser() {
		delay(2);
		DriverSingleton.closeObjectInstance();
	}
	
	public static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertical+")");
	}

}
