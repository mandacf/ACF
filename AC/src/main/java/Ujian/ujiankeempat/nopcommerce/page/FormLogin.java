package Ujian.ujiankeempat.nopcommerce.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;



public class FormLogin {
	private WebDriver driver;
	
	public FormLogin() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='RememberMe']")
	private WebElement btnRemember;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//h1[normalize-space()='Dashboard']")
	private WebElement txtDashboard;
	
	@FindBy(xpath = "//li[normalize-space()='No customer account found']")
	private WebElement txtAccount;
	
	@FindBy(xpath = "//span[@id='Email-error']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//li[normalize-space()='The credentials provided are incorrect']")
	private WebElement txtIncorrect;
	
	public void FormLoginPage(String email, String password)throws InterruptedException {
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		btnRemember.click();
		Thread.sleep(1000);
		btnSubmit.click();
		Thread.sleep(1000);
	}
	
	public void FormLoginDua(String email, String password)throws InterruptedException {
		this.email.clear();
		Thread.sleep(1000);
		this.password.clear();
		Thread.sleep(1000);
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		btnRemember.click();
		Thread.sleep(1000);
		btnSubmit.click();
	}
	
	public void FormLoginTiga(String email, String password)throws InterruptedException {
		this.email.clear();
		Thread.sleep(1000);
		this.password.clear();
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		btnRemember.click();
		Thread.sleep(1000);
		btnSubmit.click();
	}
	
	public void FormLoginEmpat(String password)throws InterruptedException {
		this.password.clear();
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		btnRemember.click();
		Thread.sleep(1000);
		btnSubmit.click();
	}
	
	public String getTxtDashboard() {
		return txtDashboard.getText();
	}
	
	public String getTxtAccount() {
		return txtAccount.getText();
	}
	
	public String getTxtemail() {
		return txtEmail.getText();
	}
	
	public String getTxtIncorrect() {
		return txtIncorrect.getText();
	}
	
}
