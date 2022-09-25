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

public class Whishlist {
	
private WebDriver driver;
	
	public Whishlist() {
		this.driver = DriverSingleton.getDriver(); 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//html[1]/body[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
	private WebElement txtWishlist;
	@FindBy(xpath = "//a[normalize-space()='My Wishlist']")
	private WebElement txtMyWishlist;
	@FindBy(xpath = "//span[normalize-space()='Product name']")
	private WebElement msgWishlist;
	
	public void Wishlist() {
		txtWishlist.click();
		txtMyWishlist.click();
	}
	
	public String getTxtWishlist() {
		return new WebDriverWait(driver, Duration.ofSeconds(6))
				.until(ExpectedConditions.visibilityOf(msgWishlist)).getText();
	}
			
}
		


