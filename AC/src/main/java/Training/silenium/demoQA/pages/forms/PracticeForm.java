package Training.silenium.demoQA.pages.forms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Training.silenium.demoQA.drivers.DriverSingleton;

public class PracticeForm {
	
	private WebDriver driver;
	
	public PracticeForm() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	private WebElement userEmail;
	
	@FindBy(xpath = "//label[@for='gender-radio-2']")
	private WebElement gender;
	
	@FindBy(xpath = "//input[@id='userNumber']")
	private WebElement userNumber;
	
	@FindBy(xpath = "//input[@id='dateOfBirthInput']")
	private WebElement dateOfBirthInput;
	
	@FindBy(id = "subjectsInput")
	private WebElement subject;
	
	@FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
	private WebElement hobies;
	
	@FindBy(xpath = "//input[@id='uploadPicture']")
	private WebElement upload;
	
	
	@FindBy(xpath = "//textarea[@id='currentAddress']")
	private WebElement currentAddress;
	
	
	
	@FindBy(id = "state")
	private WebElement state;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
	private WebElement example;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement submit;
	
	@FindBy(id = "closeLargeModal")
	private WebElement btnClose;
	
	public void PraticeFormPage(String firstName, String lastName, String userEmail,  String userNumber,String tgl,String sub, String currentAddress)  throws InterruptedException, AWTException{
		Robot rb = new Robot();
		for(int i = 0; i<5; i++) {
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_SUBTRACT);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_SUBTRACT);
		}
		this.firstName.sendKeys(firstName);
		Thread.sleep(1000);
		this.lastName.sendKeys(lastName);
		Thread.sleep(1000);
		this.userEmail.sendKeys(userEmail);
		Thread.sleep(1000);
		gender.click();
		Thread.sleep(1000);
		this.userNumber.sendKeys(userNumber);
		Thread.sleep(1000);
		isiTanggal(tgl);
		Thread.sleep(1000);
		isiSubject(sub);
		Thread.sleep(1000);
		hobies.click();
		Thread.sleep(1000);
		this.upload.sendKeys("C:\\Users\\NEXSOFT\\Pictures\\Screenshots\\a.png");
		Thread.sleep(1000);
		this.currentAddress.sendKeys(currentAddress);
		Thread.sleep(1000);
		state.click();
		Thread.sleep(500);
		List<WebElement> selectedItemState = driver.findElements(By.id("react-select-3-option-1"));
		selectedItemState.get(0).click();
		Thread.sleep(1000);
		city.click();
		Thread.sleep(1000);
		List<WebElement> selectedItemCity = driver.findElements(By.id("react-select-4-option-1"));
		selectedItemCity.get(0).click();
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(1000);
		btnClose.click();
//		btnClose.click();
	}
	
	public void isiTanggal(String tgl) {
		try {
			Robot rbt = new Robot();
			this.dateOfBirthInput.click();
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_A);
			rbt.keyRelease(KeyEvent.VK_CONTROL);
			rbt.keyRelease(KeyEvent.VK_A);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.dateOfBirthInput.sendKeys(tgl);
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void isiSubject(String sub) {
		try {
			Robot rbt = new Robot();
			this.subject.click();
			this.subject.sendKeys(sub);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public String getClose() {
		return btnClose.getText();
	}
	
//	public String getTxtEmp() {
//		return example.getText();
//	}

}
