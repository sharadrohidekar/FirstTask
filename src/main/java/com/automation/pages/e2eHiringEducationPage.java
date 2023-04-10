package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringEducationPage {
	
public e2eHiringEducationPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[9]")
public static WebElement Education;

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/img[1]")
public static WebElement editEdu;

@FindBy(xpath = "(//input[@id='react-select-4-input'])[1]")
public static WebElement school;

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]")
public static WebElement degree;

@FindBy(xpath = "//div[@id='react-select-5-option-14']")
public static WebElement PGD;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]")
public static WebElement specialization;

@FindBy(xpath = "//div[normalize-space()='Mechanical Engineering']")
public static WebElement mechanical;


@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/input[1]")
public static WebElement passingYear;

@FindBy(xpath = "(//button[@class='ant-picker-header-super-prev-btn'])[1]")
public static WebElement leftArrow;

@FindBy(xpath = "(//div[normalize-space()='2015'])[1]")
public static WebElement yearSelected;

@FindBy(xpath = "(//input[@id='auto-highlight'])[1]")
public static WebElement scorePath;

@FindBy(xpath = "(//li[@id='auto-highlight-option-1'])[1]")
public static WebElement selectCGPA;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/input[1]")
public static WebElement enterCGPA;

@FindBy(xpath = "(//input[@id='auto-highlight'])[2]")
public static WebElement medium;

@FindBy(xpath = "(//li[@id='auto-highlight-option-0'])[1]")
public static WebElement english;

@FindBy(xpath = "//span[normalize-space()='Full time']")
public static WebElement fullTime;

@FindBy(xpath = "(//div[@id='Save'])[1]")
public static WebElement saveEdu;

}











