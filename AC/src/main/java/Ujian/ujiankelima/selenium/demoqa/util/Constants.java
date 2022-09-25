package Ujian.ujiankelima.selenium.demoqa.util;

public class Constants {
	public static final int TIMEOUT = 10;
	public static final String CHROME = "Chrome";//driver mana yang bakal digunain
	public static final String FIREFOX = "Firefox";
	public static final String URL = "https://demoqa.com/automation-practice-form";
	public static final String URLAMAZON = "https://katalon-test.s3.amazonaws.com/aut/html/form.html";
	public static final String URLHRM = "https://opensource-demo.orangehrmlive.com";
	public static final String URLShop = "https://shop.demoqa.com/";
	public static final String URLREGIST = "https://shop.demoqa.com/my-account/";
	public static final String GLOB_PARAM_DELAY = "y";
	
	public static void delay(int detik, String delays) {
		if(delays.equals("y"))
		{
			try {
				Thread.sleep(1000*detik);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	//dr conttan di new ke chorome
}
