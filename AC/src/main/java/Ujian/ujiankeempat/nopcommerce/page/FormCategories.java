package Ujian.ujiankeempat.nopcommerce.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ujian.ujiankeempat.nopcommerce.drivers.DriverSingleton;

public class FormCategories {
	
private WebDriver driver;
	
	public FormCategories() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//input[@id='SearchCategoryName']")
	private WebElement categoryName;
	
	@FindBy(xpath = "//select[@id='SearchPublishedId']/option[2]")
	private WebElement publish;
	
	
	@FindBy(xpath = "//button[@id='search-categories']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//td[normalize-space()='Computers']")
	private WebElement txtComputer;
	
	@FindBy(xpath = "//p[normalize-space()='Catalog']")
	private WebElement catalog;
	
	@FindBy(xpath = "//p[normalize-space()='Categories']")
	private WebElement categories;
	
	@FindBy(xpath = "//td[@class='dataTables_empty']")
	private WebElement datatable;
	
	public void FormCategoriesPage(String categoryName)throws InterruptedException {
		btnSubmit.click();
		Thread.sleep(1000);
		catalog.click();
		Thread.sleep(1000);
		categories.click();
		Thread.sleep(1000);
		this.categoryName.sendKeys(categoryName);
		Thread.sleep(1000);
		publish.click();
		Thread.sleep(1000);
		btnSearch.click();
		Thread.sleep(1000);
	}
	
	
	public String getTxtSearchCom() {
		return txtComputer.getText();
	}
	
	public String getTxtSearchEmpty() {
		return datatable.getText();
	}

}
