package com.socinator.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.socinator.qa.base.TestBase;
import com.socinator.qa.util.Helpers;

public class PricingPage  extends BasePage {

	public PricingPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	
	Helpers helper=new Helpers();
	
@FindBy (xpath="//a[text()='Pricing']")
WebElement pricing;

@FindBy(xpath="(//table[@class='price-table']/tbody/tr[14]/td[1]/a[text()='Avail'])[1]")
WebElement plane;

public void pricingTest() {
	helper.waitForPageToLoad();
	helper.highLightElement(driver, pricing);
	helper.click(pricing);
	Reporter.log("Page Title" + driver.getTitle());
	helper.waitForPageToLoad();
	
	
	helper.waitForPageToLoad();
	helper.click(plane);
	
}
}
