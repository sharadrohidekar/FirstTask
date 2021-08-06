package com.tutorialsninja.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;



public class NavigatePage {
	
	public NavigatePage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath="//a[@class='navbar-brand mobile']//img[@alt='DIATOZ Logo']")
	public static WebElement diatozLogo;
	
}