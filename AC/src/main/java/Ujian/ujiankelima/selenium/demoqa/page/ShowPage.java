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

public class ShowPage {
	
private WebDriver driver;
	
	public ShowPage() {
		this.driver = DriverSingleton.getDriver(); //getDriver sudah di set di Test Login
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='noo-product-item noo-product-sm-4 not_featured post-1497 product type-product status-publish has-post-thumbnail product_cat-t-shirt product_tag-t-shirt product_tag-women has-featured first instock shipping-taxable purchasable product-type-variable']//span[@class='noo-quick-view icon_zoom-in_alt']")
	private WebElement btnZoom;
	@FindBy(xpath = "//a[@class='noo-quick-link']")
	private WebElement btnQuick;
	@FindBy(xpath = "//h1[@class='product_title entry-title']")
	private WebElement txtPink;
	
	public void shareProduct() {
		try {
			Robot rbt = new Robot();
			btnZoom.click();
			for (int i=0; i<4; i++) {
			rbt.keyPress(KeyEvent.VK_CONTROL);
			rbt.keyPress(KeyEvent.VK_SUBTRACT);
			rbt.keyPress(KeyEvent.VK_SUBTRACT);
			rbt.keyPress(KeyEvent.VK_CONTROL);
			}
			btnQuick.click();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public String getTxtDetail() {
		return new WebDriverWait(driver, Duration.ofSeconds(6))
				.until(ExpectedConditions.visibilityOf(txtPink)).getText();
	}

}
