package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.EnterEmailPage;

import cucumber.api.java.en.And;

public class EnterEmail {
	
	EnterEmailPage eep = new EnterEmailPage();
	
	@And("^I enter the Email \"([^\"]*)\"$")
	public void i_enter_the_Email(String myEmail) throws InterruptedException{
		
		Elements.TypeText(EnterEmailPage.EmailEnter, myEmail);
		Thread.sleep(2000);
	}
}
