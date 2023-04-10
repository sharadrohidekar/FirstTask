package com.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringJobPreferencePage {
	
public e2eHiringJobPreferencePage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
@FindBy(xpath = "(//button[normalize-space()='Job Preference'])[1]")
public static WebElement jobPreference;

@FindBy(xpath = "(//img[@alt='Pencil'])[1]")
public static WebElement editJob;

@FindBy(xpath = "(//span[normalize-space()='Full Time'])[1]")
public static WebElement fullTimejob;

@FindBy(xpath = "(//input[@class='ant-checkbox-input'])[1]")
public static WebElement workFromOffice;

@FindBy(xpath = "//input[@class='tags__input']")
public static WebElement enterCity;

@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[1]")
public static WebElement currentSalaryFrom;

@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='5 Lacs'])[1]")
public static WebElement currentSalaryValue;

@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
public static WebElement currentSalaryTo;

@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='30 Thousand'])[1]")
public static WebElement currentSalaryValueto;

@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[3]")
public static WebElement expectedSalaryFrom;

@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='7 Lacs'])[2]")
public static WebElement expectedSalaryValue;

@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[4]")
public static WebElement expectedSalaryTo;

@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='20 Thousand'])[2]")
public static WebElement expectedSalaryValueto;

@FindBy(xpath = "(//div[@id='Save'])[1]")
public static WebElement saveit;

















}
