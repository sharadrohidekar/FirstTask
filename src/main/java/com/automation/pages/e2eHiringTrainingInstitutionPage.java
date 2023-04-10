package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringTrainingInstitutionPage {
	
public e2eHiringTrainingInstitutionPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}

@FindBy(xpath = "(//button[normalize-space()='Training Institution'])[1]")
public static WebElement trainInst;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/img[1]")
public static WebElement addTI;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]")
public static WebElement trainingName;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
public static WebElement institute;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[4]/fieldset[1]/div[1]/label[2]/span[2]")
public static WebElement no;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
public static WebElement startDate;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")
public static WebElement startYear;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
public static WebElement startMonth;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]")
public static WebElement selectDate;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]")
public static WebElement endDate;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")
public static WebElement endYear;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
public static WebElement endMonthOn;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[6]")
public static WebElement enterDate;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[6]/div[2]/div[1]/input[1]")
public static WebElement description;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/div[8]/div[1]/div[1]/div[1]")
public static WebElement saveTI;





}
