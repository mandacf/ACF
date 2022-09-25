package Ujian.ujiankelima.selenium.demoqa.page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ujian.ujiankelima.selenium.demoqa.driver.DriverSingleton;



public class RegisterPage {
	
private WebDriver driver;
	
	public RegisterPage() {
		this.driver = DriverSingleton.getDriver(); 
		PageFactory.initElements(driver, this);
	}
	
		//Page Factory
		@FindBy(xpath = "//input[@id='reg_username']")
		private WebElement username;
		@FindBy(xpath = "//input[@id='reg_email']")
		private WebElement email;
		@FindBy(xpath = "//input[@id='reg_password']")
		private WebElement password;
		@FindBy(xpath = "//button[@name='register']")
		private WebElement btnRegister;
		@FindBy(xpath = "//div[@id='primary']//li[1]")
		private WebElement msgError;
		
		
		
		
		public void registerInvalid(String username, String email, String password) {
			this.username.sendKeys(username);
			this.email.sendKeys(email);
			this.password.sendKeys(password);
			btnRegister.click();
		}
		
		public String TxtInvalid() {
			return new WebDriverWait(driver, Duration.ofSeconds(6))
					.until(ExpectedConditions.visibilityOf(msgError)).getText();
		}
		
		

}
