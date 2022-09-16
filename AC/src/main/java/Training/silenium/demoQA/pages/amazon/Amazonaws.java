package Training.silenium.demoQA.pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Training.silenium.demoQA.drivers.DriverSingleton;

public class Amazonaws {
	
	private WebDriver driver;
	
	public Amazonaws() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//label[normalize-space()='Female']//input[@name='gender']")
	private WebElement gender;
	
	@FindBy(xpath = "//input[@id='dob']")
	private WebElement date;
	
	@FindBy(xpath = "//input[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='company']")
	private WebElement company;
	
	@FindBy(xpath = "//option[@value='Developer']")
	private WebElement role;
	
	@FindBy(xpath = "//option[@value='High salary']")
	private WebElement salary;
	
	@FindBy(xpath = "//label[normalize-space()='Take online courses']//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//textarea[@id='comment']")
	private WebElement comment;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//span[@id='submit-msg']")
	private WebElement msg;
	
	public void FormAmazonPage(String firstName, String lastname,  String date, String address, String email, String company,   String comment, String password) throws InterruptedException {
		this.firstName.sendKeys(firstName);
		Thread.sleep(1000);
		this.lastname.sendKeys(lastname);
		Thread.sleep(1000);
		gender.click();
		Thread.sleep(1000);
		this.date.sendKeys(date);
		Thread.sleep(1000);
		this.address.sendKeys(address);
		Thread.sleep(1000);
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.password.sendKeys(password);
		Thread.sleep(1000);
		this.company.sendKeys(company);
		Thread.sleep(1000);
		role.click();
		Thread.sleep(1000);
		salary.click();
		Thread.sleep(1000);
		checkbox.click();
		Thread.sleep(1000);
		this.comment.sendKeys(comment);
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(1000);
	
	}
	
	public String getTxtMsg() {
		return msg.getText();
	}


}
