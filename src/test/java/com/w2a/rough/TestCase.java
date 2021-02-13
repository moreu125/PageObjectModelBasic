package com.w2a.rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.w2a.BasePages.Page;
import com.w2a.pages.AddCustomerPage;
import com.w2a.pages.AddTariffPage;
import com.w2a.pages.HomePageClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {


	@Test
	public void demoTest() throws IOException {

		HomePageClass homePage = new HomePageClass();
		System.out.println(homePage.getTitle());

		AddCustomerPage addCustomer = homePage.goToAddCustomerPage();
		System.out.println(addCustomer.getTitle());

	}
    
	@Test
	public void demoTest2() throws IOException {
		HomePageClass homePage = new HomePageClass();
        System.out.println(homePage.getTitle());
		AddTariffPage addTariffPage = homePage.goToAddTariffPage();
		
	}
	
	
	
	
	@Test
	public void readPropertiesFile() throws FileNotFoundException, IOException {
		File file = new File(".\\src\\test\\resources\\Properties\\config.properties");
		Properties pro = new Properties();
		pro.load(new FileInputStream(file));
		System.out.println(pro.get("browser"));
	    HomePageClass homePage = new HomePageClass();
	}
	@AfterMethod
	public  void tearDown() {
	 Page.tearDown();
	}
}






















