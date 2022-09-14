package Latihan.latihanSilenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CobaSilenium {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);
		 
//		 WebElement menuForm = driver.findElement(By.linkText("Form"));
//		 menuForm.click();
		 
		 WebElement formName = driver.findElement(By.id("first-name"));
		 formName.sendKeys("Sutarno");
		 
		 WebElement formLastName = driver.findElement(By.id("last-name"));
		 formLastName.sendKeys("lili");
		 
		 WebElement formJob = driver.findElement(By.id("job-title"));
		 formJob.sendKeys("Developer");
		 
		 WebElement formRadio = driver.findElement(By.id("radio-button-1"));
		 formRadio.click();
		 
		 WebElement formCheck = driver.findElement(By.id("checkbox-1"));
		 formCheck.click();
		 
		 
		 Select selectForm = new Select(driver.findElement(By.id("select-menu")));
		 selectForm.selectByValue("2");
		 
		 WebElement formDate = driver.findElement(By.id("datepicker"));
		 formDate.sendKeys("09/26/2022");
		 
		 WebElement formSubmit =driver.findElement(By.linkText("Submit"));
		 formSubmit.click();
		 
		}

}
