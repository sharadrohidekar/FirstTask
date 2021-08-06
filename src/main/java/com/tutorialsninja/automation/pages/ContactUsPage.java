package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class ContactUsPage {
		
		public  ContactUsPage() {
			
			PageFactory.initElements(Base.driver, this);
			
		}
			
		@FindBy(xpath="//a[contains(text(),'Contact Us')]")
		public static WebElement Contactus;
		
		@FindBy(xpath="//input[@placeholder='Name']")
		public static WebElement NameField;
		
		@FindBy(xpath="//input[@placeholder='Phone']")
		public static WebElement PhoneField;
		
		@FindBy(xpath="//input[@placeholder='Email']")
		public static WebElement EmailField;
		
		@FindBy(xpath="//textarea[@placeholder='Description']")
		public static WebElement DescriptionField;
		
}