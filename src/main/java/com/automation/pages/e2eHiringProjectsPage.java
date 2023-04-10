package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringProjectsPage {
	
public e2eHiringProjectsPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}


@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[14]")
public static WebElement projects;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/img[1]")
public static WebElement addProjects;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")
public static WebElement projectName;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/input[1]")
public static WebElement role;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/input[1]")
public static WebElement client;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
public static WebElement durationStart;

@FindBy(xpath = "//body[1]/div[3]/div[1]/ul[1]/li[1]")
public static WebElement oneYear;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
public static WebElement durationEnds;

@FindBy(xpath = "//body[1]/div[3]/div[1]/ul[1]/li[1]")
public static WebElement zeroMonth;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]/div[2]/div[1]/input[1]")
public static WebElement technology;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[6]/div[2]/div[1]/input[1]")
public static WebElement projectDesc;

@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[8]/div[1]/div[1]/div[1]")
public static WebElement saveProject;









}
