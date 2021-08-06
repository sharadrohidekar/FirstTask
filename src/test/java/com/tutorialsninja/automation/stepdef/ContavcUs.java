package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ContactUsPage;

import cucumber.api.java.en.And;

public class ContavcUs {
	
	ContactUsPage conPage = new ContactUsPage();
	
	@And("^I click on Contact Us$")
	public void i_click_on_Contact_Us() throws InterruptedException{
		
		Elements.click(ContactUsPage.Contactus);
		Thread.sleep(5000);
		
	}
	
	@And("^I enter the Name field \"([^\"]*)\"$")
	public void i_enter_the_Name_field(String name) throws InterruptedException{
		
		Elements.TypeText(ContactUsPage.NameField, name);
		Thread.sleep(5000);
		
	}
	
	@And("^I enter the Phone field \"([^\"]*)\"$")
	public void i_enter_the_Phone_field(String phone) throws InterruptedException{
		
		Elements.TypeText(ContactUsPage.PhoneField, phone);
		Thread.sleep(5000);
		
	}

	@And("^I enter the Email field \"([^\"]*)\"$")
	public void i_enter_the_Email_field(String email) throws InterruptedException{
		
		Elements.TypeText(ContactUsPage.EmailField, email);
		Thread.sleep(5000);
		
	}

	@And("^I enter the Description field \"([^\"]*)\"$")
	public void i_enter_the_Description_field(String descrip) throws InterruptedException{
		
		Elements.TypeText(ContactUsPage.DescriptionField, descrip);	
		Thread.sleep(5000);
	}

}
