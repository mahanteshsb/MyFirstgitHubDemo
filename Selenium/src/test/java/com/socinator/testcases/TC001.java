package com.socinator.testcases;

import org.testng.annotations.Test;

import com.socinator.qa.base.TestBase;
import com.socinator.qa.pages.FeaturesPage;
import com.socinator.qa.pages.PricingPage;
import com.socinator.qa.pages.homePage;

public class TC001 extends TestBase {

	@Test(priority =2 )
public void verify_domainRegistrationDate() throws InterruptedException {
		
		homePage home=new homePage(getDriver());
		home.launch();
	}
	
	@Test(priority =3 )
public void verify_feature() throws InterruptedException {
		
		FeaturesPage feature=new FeaturesPage(getDriver());
		feature.instaTest();
	}
//	
	@Test()
	public void verify_pricing() throws InterruptedException{
		PricingPage  pricing=new PricingPage (getDriver());
		pricing.pricingTest();
	}
	
}
