package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringCertificationsPage {
	
public e2eHiringCertificationsPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}

@FindBy(xpath = "(//button[normalize-space()='Certifications'])[1]")
public static WebElement certifications;

@FindBy(xpath = "//img[@alt='add icon']")
public static WebElement addCertification;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")
public static WebElement certificationName;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/input[1]")
public static WebElement certifiedBy;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/input[1]")
public static WebElement linkOptional;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[1]/div[1]/input[1]")
public static WebElement issuedOn;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")
public static WebElement clickyear;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
public static WebElement clickOnMonth;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[4]")
public static WebElement clickDate;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
public static WebElement validTill;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")
public static WebElement yearclick;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
public static WebElement monthClick;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[7]")
public static WebElement dateClick;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[2]/div[2]/div[1]/input[1]")
public static WebElement grade;

@FindBy(xpath = "(//input[@name='gradesvalid'])[1]")
public static WebElement lifeTimeValidity;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[8]/div[1]/div[1]/div[1]")
public static WebElement clickOnSave;











}
