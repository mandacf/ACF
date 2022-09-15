package tugas.silenium.formy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class ComplateWebForm {
	
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testComplateWebForm() throws Exception {
	    driver.get("https://formy-project.herokuapp.com/");
	    driver.findElement(By.linkText("Form")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("first-name")).click();
	    driver.findElement(By.id("first-name")).clear();
	    driver.findElement(By.id("first-name")).sendKeys("Alamanda");
	    Thread.sleep(1000);
	    driver.findElement(By.id("last-name")).click();
	    driver.findElement(By.id("last-name")).clear();
	    driver.findElement(By.id("last-name")).sendKeys("Cathartica");
	    Thread.sleep(1000);
	    driver.findElement(By.id("job-title")).click();
	    driver.findElement(By.id("job-title")).clear();
	    driver.findElement(By.id("job-title")).sendKeys("QA");
	    Thread.sleep(1000);
	    driver.findElement(By.id("radio-button-2")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("checkbox-2")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("select-menu")).click();
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("select-menu"))).selectByVisibleText("0-1");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//option[@value='1']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("datepicker")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[1]/following::th[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[2]/following::th[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[2]/following::th[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[2]/following::th[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[2]/following::th[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[3]/following::th[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='»'])[3]/following::span[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mar'])[1]/following::span[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[16]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Submit")).click();
	    Thread.sleep(1000);
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
