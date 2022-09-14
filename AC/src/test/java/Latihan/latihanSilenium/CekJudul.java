package Latihan.latihanSilenium;

import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CekJudul {
	
	@Test
	public void cekGoogle() {
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\NEXSOFT\\Documents\\software\\chromedriver_win32\\chromedriver.exe");
	WebDriverManager.chromiumdriver().setup();
//	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new ChromeDriver();
	 
	 String baseUrl = "http://google.com";
	 String expectedTitle = "Google";
	 driver.get(baseUrl);
	 String actualTitle = driver.getTitle();
	 assertEquals(actualTitle, expectedTitle);
	 
//	 driver.close();
//	 
	}


}
