package com.w2a.pages;

import org.openqa.selenium.WebDriver;

public class HomePageClass {
   public WebDriver driver ;
    
   public AddCustomerPage goToAddCustomerPage() {
	return new AddCustomerPage(driver);
	   
   }
   
   public AddTariffPage goToAddTariffPage() {
	   return new AddTariffPage(driver);
   }
   
   public AddTariffPlanToCustomerPage goToAddTariffPlanToCustomerPage() {
	   return new AddTariffPlanToCustomerPage(driver);
   }
   
   public ToPayBillPage goToPayBillPage () {
	   return new ToPayBillPage(driver);
   }
}
