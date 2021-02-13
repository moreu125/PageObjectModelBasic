package com.w2a.BasePages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {
	public static WebDriver driver;
	public static Properties proConfig = new Properties();
	public FileInputStream fis;

	public Page() {
		if (driver == null) {
			FileInputStream fis;
			try {
				fis = new FileInputStream(".\\src\\test\\resources\\Properties\\config.properties");
				proConfig.load(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (proConfig.getProperty("browser").equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (proConfig.getProperty("browser").equals("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			driver.get(proConfig.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}

	}

	public static void tearDown() {
		driver.quit();
		driver = null;
	}

}
