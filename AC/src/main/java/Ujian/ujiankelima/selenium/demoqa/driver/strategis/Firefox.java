package Ujian.ujiankelima.selenium.demoqa.driver.strategis;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox implements DriverStrategy{
	public WebDriver setStrategy() {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}