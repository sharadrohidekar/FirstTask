package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.NavigatePage;

import cucumber.api.java.en.*;

public class Navigate {
	
	NavigatePage nav = new NavigatePage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application(){
		
		Base.driver.get(Base.reader.getUrl());
		
	}

	@And("^I confirm the text present or not$")
	public void i_confirm_the_text_present_or_not(){
		
		//Elements.isDisplayed(NavigatePage.diatozLogo);
		Assert.assertTrue(Elements.isDisplayed(NavigatePage.diatozLogo));   //imp
		System.out.println("I am executing bcz of assert");
		
	}

}
