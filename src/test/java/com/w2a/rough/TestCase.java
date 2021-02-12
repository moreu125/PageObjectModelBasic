package com.w2a.rough;

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
	public void demoTest() {

		HomePageClass homePage = new HomePageClass();
		System.out.println(homePage.getTitle());

		AddCustomerPage addCustomer = homePage.goToAddCustomerPage();
		System.out.println(addCustomer.getTitle());

	}
    
	@Test
	public void demoTest2() {
		HomePageClass homePage = new HomePageClass();
        System.out.println(homePage.getTitle());
		AddTariffPage addTariffPage = homePage.goToAddTariffPage();
		
	}
	
	@AfterMethod
	public  void tearDown() {
	 Page.tearDown();
	}
}








