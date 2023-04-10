package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringWorkExperiencePage {
	
public e2eHiringWorkExperiencePage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[12]")
public static WebElement workExp;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]")
public static WebElement add;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
public static WebElement company;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
public static WebElement companyName;

@FindBy(xpath = "(//span[normalize-space()='No'])[1]")
public static WebElement no;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/input[1]")
public static WebElement industry;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div[1]/div[5]")
public static WebElement animate;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
public static WebElement designation;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div[5]")
public static WebElement csa;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
public static WebElement workFromexp;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")
public static WebElement fromYear;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
public static WebElement fromMonth;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]")
public static WebElement fromDate;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")
public static WebElement tillWorkExp;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")
public static WebElement tillYear;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
public static WebElement tillMonth;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[6]")
public static WebElement tillDate;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]")
public static WebElement saveWorkExp;

}
