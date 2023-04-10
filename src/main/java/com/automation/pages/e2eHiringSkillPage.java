package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringSkillPage {
	
public e2eHiringSkillPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[8]")
public static WebElement skill;

@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/img[1]")
public static WebElement editSkill;

@FindBy(xpath = "//input[@id='react-select-4-input']")
public static WebElement addSkill;

@FindBy(xpath = "(//div)[201]")
public static WebElement saveSkill;

















}
