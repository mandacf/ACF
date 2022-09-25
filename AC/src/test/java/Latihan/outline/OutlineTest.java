package Latihan.outline;

import static org.testng.Assert.assertEquals;

import com.relevantcodes.extentreports.LogStatus;

import Ujian.ujiankeempat.hrm.util.Constants;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class OutlineTest {
	
	
	@When("Browser open Web HRM Outlinee")
	public void browser_open_web_hrm_outlinee() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Browser open Web HRM Outlinee");
	}

	@When("Enter invalid (.*) and (.*) Outline")
	public void enter_invalid_password_and_username_outline() {
		System.out.println("user_enter_username_password_invalid uName : "+username+" pwd : "+password);
		loginPage.login(username, password);
		extentTest.log(LogStatus.PASS, "enter_invalid_password_and_username_outlinee");
	}

	@Then("System check credentials invalid Outline")
	public void system_check_credentials_invalid_outline() {
		assertEquals(loginPage.msgInvalid(10), "Invalid credentials");
		extentTest.log(LogStatus.PASS, "System check credentials invalid Outlinee");
	}

}
