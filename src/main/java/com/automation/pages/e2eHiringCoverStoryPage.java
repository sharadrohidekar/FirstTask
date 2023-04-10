package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringCoverStoryPage {
	
public e2eHiringCoverStoryPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[5]")
public static WebElement CoverStory;

@FindBy(xpath = "//span[contains(text(),'Upload/Create')]")
public static WebElement upload;

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]")
public static WebElement uploadVideo;

@FindBy(xpath = "//span[contains(text(),'Browse files')]")
public static WebElement browseFiles;

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[5]")
public static WebElement submit;














}
