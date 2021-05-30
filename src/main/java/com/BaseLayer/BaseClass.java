package com.BaseLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

		public static WebDriver driver;
		
		public static void initialiazation() {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumTesting\\chrome90\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/r.php");
		}
}
