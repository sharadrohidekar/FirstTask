package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class EnterEmailPage {
	
public EnterEmailPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Enter your email']")
	public static WebElement EmailEnter;

}
