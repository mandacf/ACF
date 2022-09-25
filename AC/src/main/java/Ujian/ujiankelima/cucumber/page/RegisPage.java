package Ujian.ujiankelima.cucumber.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ujian.ujiankelima.selenium.demoqa.driver.DriverSingleton;

public class RegisPage {
	
private WebDriver driver;
	
	public RegisPage() {
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
			
			try {
				Robot rbt = new Robot();
				for (int i=0; i<2; i++) {
				rbt.keyPress(KeyEvent.VK_CONTROL);
				rbt.keyPress(KeyEvent.VK_SUBTRACT);
				rbt.keyRelease(KeyEvent.VK_CONTROL);
				rbt.keyRelease(KeyEvent.VK_SUBTRACT);
				}
				
			} catch (AWTException e) {
				
				e.printStackTrace();
			}
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
