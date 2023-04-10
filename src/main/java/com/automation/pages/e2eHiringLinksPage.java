package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringLinksPage {
	
public e2eHiringLinksPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[6]")
public static WebElement links;

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/input[1]")
public static WebElement github;

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/input[1]")
public static WebElement linkedin;

@FindBy(xpath = "//div[@id='Save']")
public static WebElement savelink;














}
