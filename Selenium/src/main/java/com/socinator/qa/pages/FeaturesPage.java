package com.socinator.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.socinator.qa.base.TestBase;
import com.socinator.qa.util.Helpers;

public class FeaturesPage extends BasePage{

	public FeaturesPage(WebDriver driver) {
		super(TestBase.getDriver());	
	}

	Helpers helpers=new Helpers();
	
	
	@FindBy(xpath="//a[text()='Features']")
	WebElement features;
	
	@FindBy(xpath="//a[text()='Instagram Marketing']")
	WebElement Instagram;
	
	@FindBy(xpath="//a[text()='Facebook Marketing']")
	WebElement Facebook;
	
	
	public void instaTest() {
		
		helpers.waitForPageToLoad();
		helpers.waitFor(features);
		helpers.highLightElement(driver, features);
		helpers.moveToElement(features);
		Reporter.log("PAge title" + driver.getTitle());
		helpers.waitForPageToLoad();
			
		helpers.waitFor(Instagram);
		helpers.highLightElement(driver, Instagram);
		helpers.click(Instagram);
		Reporter.log("PAge title" + driver.getTitle());
		helpers.waitForPageToLoad();
		
		driver.navigate().back();
		helpers.waitForPageToLoad();
		
		helpers.waitFor(features);
		helpers.highLightElement(driver, features);
		helpers.moveToElement(features);
		Reporter.log("PAge title" + driver.getTitle());
		helpers.waitForPageToLoad();
		
		helpers.waitFor(Facebook);
		helpers.highLightElement(driver, Facebook);
		helpers.click(Facebook);
		Reporter.log("PAge title" + driver.getTitle());
		helpers.waitForPageToLoad();
		
	}
}
