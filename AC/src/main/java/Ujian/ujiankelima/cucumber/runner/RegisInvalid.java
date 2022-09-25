package Ujian.ujiankelima.cucumber.runner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Ujian.ujiankelima.cucumber.page.RegisPage;

import Ujian.ujiankelima.selenium.demoqa.util.Constants;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class RegisInvalid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private RegisPage regisPage = new RegisPage();
	private String strValidation ="";
	
	public RegisInvalid() {
		driver = SceneOutlineHooks.driver;
		extentTest = SceneOutlineHooks.extentTest;
	}
	
	
	@When("Browser open Web Shop Demo QA Outlinee")
	public void browser_open_web_shop_demo_qa_outlinee() {
		driver.get(Constants.URLREGIST);
		extentTest.log(LogStatus.PASS, "Browser open Web HRM Outlinee"); 
	}

	@When("^Enter invalid (.*), (.*) and (.*) Outlinee$")
	public void enter_invalid_username_email_and_password_outlinee(String username, String email, String password) {
		System.out.println("user_enter_username_password_invalid usName : "+username+" Mail : "+email+ " pass : "+password);
		regisPage.registerInvalid(username, email, password);
		extentTest.log(LogStatus.PASS, "enter_invalid_username_email_and_password_outlinee");
	}

//	@When("button register clicked Outlinee")
//	public void button_register_clicked_outlinee() {
//	   
//	}

	@Then("System check credentials invalid Outlinee")
	public void system_check_credentials_invalid_outlinee() {
		assertTrue(regisPage.TxtInvalid().contains("Error:") );
		extentTest.log(LogStatus.PASS, "System check credentials invalid Outlinee");
	}

}
