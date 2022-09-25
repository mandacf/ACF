package Latihan.cucumber.framework.demoqa;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Training.silenium.demoQA.pages.hrm.LoginPage;
import Training.silenium.demoQA.util.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {

	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestLogin() {
		driver = SceneFirstHooks.driver;
		extentTest = SceneFirstHooks.extentTest;
	}
	
	
	@When("User go to Web HRM")
	public void user_go_to_Web_HRM() {
		driver.get(Constants.URLHRM);
		extentTest.log(LogStatus.PASS, "User go to Web HRM");
		
	}
	
	@And("User enter username password invalid")
	public void user_enter_username_password_invalid() {
		loginPage.login("Admin", "admin1234");
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
//	
//	@And("User click button login")
//	public void user_click_button_login() {
//		loginPage.clickBtnLogin();
//		extentTest.log(LogStatus.PASS, "User click button login");
//	}
//	
	@Then("User invalid employee")
	public void user_invalid_employee() {
		assertEquals(loginPage.msgInvalid(10), "Invalid credentials");
		extentTest.log(LogStatus.PASS, "User invalid credentials");
	}
//	
	@And("User enter username password valid")
	public void user_enter_username_password_valid() {
		loginPage.login("Admin", "admin123");
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	
//	@And("User click button login valid")
//	public void user_click_button_login_valid() {
//		loginPage.clickBtnLogin();
//		extentTest.log(LogStatus.PASS, "User click button login valid");
//	}
	
	@Then("User valid employee")
	public void user_valid_employee() {
		String getTxtEmpInfo = loginPage.getTxtEmpInfo(10);
		extentTest.log(LogStatus.PASS, "User valid employee");
	}

}
