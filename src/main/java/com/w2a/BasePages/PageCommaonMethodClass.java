package com.w2a.BasePages;

import org.openqa.selenium.WebDriver;

public class PageCommaonMethodClass {
    WebDriver driver = Page.driver;
    
    public String getTitle() {
    	return driver.getTitle();
    }
}
