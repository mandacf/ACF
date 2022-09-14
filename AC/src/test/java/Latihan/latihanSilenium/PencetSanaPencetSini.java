package Latihan.latihanSilenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PencetSanaPencetSini {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);
		 WebElement buttonDropdown = driver.findElement(By.id("navbarDropdownMenuLink"));
		 buttonDropdown.click();
		 WebElement buttonAutoComplate = driver.findElement(By.linkText("Autocomplete"));
		 buttonAutoComplate.click();
		 WebElement formAddres = driver.findElement(By.id("autocomplete"));
		 formAddres.sendKeys("jln Srijaya");
		 WebElement formNoJalan = driver.findElement(By.id("street_number"));
		 formNoJalan.sendKeys("321");
		 WebElement formNoJalan2 = driver.findElement(By.id("route"));
		 formNoJalan2.sendKeys("456");
		 
		}

}
