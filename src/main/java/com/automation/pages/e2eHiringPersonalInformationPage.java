package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringPersonalInformationPage {
	
public e2eHiringPersonalInformationPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}


@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[15]")
public static WebElement personalInformation;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
public static WebElement addPI;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[2]")
public static WebElement maleIn;

@FindBy(xpath = "(//input[@id='rc_select_0'])[1]")
public static WebElement language;

@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Kannada'])[1]")
public static WebElement kannada;

@FindBy(xpath = "(//input[@id='outlined-basic'])[1]")
public static WebElement pincode;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[9]/div[1]/div[1]/div[1]")
public static WebElement savePI;








}
