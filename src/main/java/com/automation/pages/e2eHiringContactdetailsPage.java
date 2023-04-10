package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringContactdetailsPage {
	
public e2eHiringContactdetailsPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[3]")
public static WebElement phoneNumber;

@FindBy(xpath = "//img[@alt='Pencil']")
public static WebElement editButton;

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")
public static WebElement enterPhoneNumber;

@FindBy(xpath = "//span[contains(text(),'Send OTP')]")
public static WebElement sendOTP;

@FindBy(xpath = "//button[contains(text(),'Cancel')]")
public static WebElement cancel;









}
