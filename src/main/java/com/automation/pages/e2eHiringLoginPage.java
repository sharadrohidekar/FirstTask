package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringLoginPage {
	
public e2eHiringLoginPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
@FindBy(xpath = "//input[@placeholder='Email ID']")
public static WebElement username;

@FindBy(xpath = "//input[@placeholder='Password']")
public static WebElement password;

@FindBy(xpath = "//button[@class='ant-btn ant-btn-submit ant-btn-block styledComponents__StyledButton-sc-4947a9-0 gDuwDr']")
public static WebElement loginButton;

	
}
