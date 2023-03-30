package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class ScenarioA2Page {

public ScenarioA2Page(){
	
	PageFactory.initElements(Base.driver, this);
}

@FindBy(xpath = "//div[@class='navbar-wrapper-navigation navbar-selected-wrapper-navigation']//img[@id='mentorship']")
public static WebElement mentorship;

@FindBy(xpath = "//div[@id='rc-tabs-0-tab-1']")
public static WebElement overview;

@FindBy(xpath = "//button[normalize-space()='Register for Orientation']")
public static WebElement registration;


}
