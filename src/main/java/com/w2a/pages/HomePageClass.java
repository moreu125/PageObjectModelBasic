package com.w2a.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.BasePages.Page;
import com.w2a.BasePages.PageCommaonMethodClass;

public class HomePageClass extends Page{
	public HomePageClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	PageCommaonMethodClass pcmc = new PageCommaonMethodClass();
	public String getTitle() {
		return pcmc.getTitle();
	}

	public AddCustomerPage goToAddCustomerPage() throws IOException {
		driver.findElement(By.xpath(
				"//div[@class='flex-item left']//div//h3//a[@href='addcustomer.php'][normalize-space()='Add Customer']"))
				.click();
		return new AddCustomerPage();

	}

	public AddTariffPage goToAddTariffPage() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Add Tariff Plan']")).click();
		return new AddTariffPage();
	}

	public AddTariffPlanToCustomerPage goToAddTariffPlanToCustomerPage() {
		return new AddTariffPlanToCustomerPage(driver);
	}

	public ToPayBillPage goToPayBillPage() {
		return new ToPayBillPage(driver);
	}
}
