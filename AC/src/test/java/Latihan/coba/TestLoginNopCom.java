package Latihan.coba;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.support.ui.WebDriverWait;
import Ujian.ujiankeempat.nopcommerce.page.FormLogin;
import Ujian.ujiankeempat.nopcommerce.util.Constants;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TestLoginNopCom {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private FormLogin loginPage = new FormLogin();
	
	public TestLoginNopCom() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	@When("User go to Web nopcommerce")
	public void user_go_to_web_nopcommerce() {
		driver.get(Constants.URLNop);
		extentTest.log(LogStatus.PASS, "User go to Web nopcommerce");
	}

	@When("User enter username password invalid")
	public void user_enter_username_password_invalid() throws InterruptedException{
		loginPage.FormLoginDua("manda@gmail.com", "manda1234");
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	   
	}


	@Then("User invalid data")
	public void user_invalid_data() {
		assertEquals(loginPage.getTxtAccount(10), "No customer account found");
		extentTest.log(LogStatus.PASS, "User invalid data");
	   
	}

	@When("User go to Web nopCommerce")
	public void user_go_to_web_nop_commerce() {
		driver.get(Constants.URLNop);
		extentTest.log(LogStatus.PASS, "User go to Web nopcommerce");
	}

	@When("User enter username password valid")
	public void user_enter_username_password_valid() throws InterruptedException{
		loginPage.FormLoginPage("", "");
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}

	@Then("User valid data")
	public void user_valid_data() {
		assertEquals(loginPage.getTxtDashboard(10), "Dashboard");
		extentTest.log(LogStatus.PASS, "User invalid data");
	    
	}

}
