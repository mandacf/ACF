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

public class SearchType {
	
private WebDriver driver;
	
	public SearchType() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnSearch;
	@FindBy(xpath = "//input[@name='s']")
	private WebElement inputSearch;
	@FindBy(xpath = "//h1[@class='product_title entry-title']")
	private WebElement txtSearch;
	
	public void Search(String search) throws AWTException {
		btnSearch.click();
		this.inputSearch.sendKeys(search);
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public String txtMsgSear() {
		return new WebDriverWait(driver, Duration.ofSeconds(6))
				.until(ExpectedConditions.visibilityOf(txtSearch)).getText();
	}

}
