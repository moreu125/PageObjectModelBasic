package com.w2a.BasePages;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {
	public static WebDriver driver;

	public Page() {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/telecom/index.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
	}
     
	public static void tearDown() {
		driver.quit();
		driver = null;
	}
}
