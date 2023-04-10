package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringResumeUploadPage {
	
public e2eHiringResumeUploadPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[4]")
public static WebElement resumeUpload;

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/div[4]/button[1]")
public static WebElement updateResumeButton;

@FindBy(xpath = "//input[@id='inputFile']")
public static WebElement browser;

@FindBy(xpath = "//span[contains(text(),'Submit')]")
public static WebElement submit;





















}
