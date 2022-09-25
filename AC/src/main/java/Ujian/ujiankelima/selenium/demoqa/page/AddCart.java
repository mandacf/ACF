package Ujian.ujiankelima.selenium.demoqa.page;

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

public class AddCart {
	
private WebDriver driver;
	
	public AddCart() {
		this.driver = DriverSingleton.getDriver(); 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Tokyo Talkies']")
	private WebElement txtProduct;
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement btnKeranjang;
	@FindBy(xpath = "//a[@class='button wc-forward']")
	private WebElement btnViewCart;
	@FindBy(xpath = "//h1[@class='page-title']")
	private WebElement txtCart;
	
	public void addToCart() {
		try {
			Robot rbt = new Robot();
			txtProduct.click();
			for (int i=0; i<4; i++) {
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_SUBTRACT);
			rbt.keyPress(KeyEvent.VK_SUBTRACT);
			rbt.keyPress(KeyEvent.VK_CONTROL);
			}
			btnKeranjang.click();
			btnViewCart.click();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String txtMsgCart() {
		return new WebDriverWait(driver, Duration.ofSeconds(6))
				.until(ExpectedConditions.visibilityOf(txtCart)).getText();
	}
	

}
