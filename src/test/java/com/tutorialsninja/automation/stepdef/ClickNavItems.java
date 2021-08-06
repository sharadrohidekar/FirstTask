package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ClickNavItemsPage;

import cucumber.api.java.en.*;

public class ClickNavItems {
	
	ClickNavItemsPage navItem = new ClickNavItemsPage();
	
	@And("^I click on Home$")
	public void i_click_on_Home() throws InterruptedException {
		
		Elements.click(ClickNavItemsPage.HomeNav);
		Thread.sleep(2000);
		
	}

	@And("^I click on Services$")
	public void i_click_on_Services() throws InterruptedException{
		
		Elements.click(ClickNavItemsPage.ServicesNav);
		Thread.sleep(2000);
		
	}

	@And("^I click on Products$")
	public void i_click_on_Products() throws InterruptedException{
		
		Elements.click(ClickNavItemsPage.ProductsNav);
		Thread.sleep(2000);
	}

	@And("^I click on AboutUs$")
	public void i_click_on_AboutUs() throws InterruptedException{
		
		Elements.click(ClickNavItemsPage.AboutUsNav);
		Thread.sleep(2000);
		
	}

	@And("^I click on CaseStudio$")
	public void i_click_on_CaseStudio() throws InterruptedException{
		
		Elements.click(ClickNavItemsPage.CaseStudiesNav);
		Thread.sleep(2000);
		
	}

	@And("^I click on Blogs$")
	public void i_click_on_Blogs() throws InterruptedException{
		
		Elements.click(ClickNavItemsPage.BlogsNav);
		Thread.sleep(2000);
	}

	@And("^I click on Careers$")
	public void i_click_on_Careers() throws InterruptedException{
		
		Elements.click(ClickNavItemsPage.CareersNav);
		Thread.sleep(2000);
	}

	@And("^I click on ContactUs$")
	public void i_click_on_ContactUs() throws InterruptedException{
		
		Elements.click(ClickNavItemsPage.ContactUsNav);
		Thread.sleep(2000);
	}


}
