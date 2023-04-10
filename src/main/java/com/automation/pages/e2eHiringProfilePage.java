package com.automation.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class e2eHiringProfilePage {
	
public e2eHiringProfilePage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}

@FindBy(xpath = "//div[@class='desktop-navbar d-flex align-items-center']//span[@class='user-me-title d-none d-md-block'][normalize-space()='Me']")
public static WebElement Me;

@FindBy(xpath = "//button[@class='user-contact-details-button-navbar']")
public static WebElement viewProfile;

@FindBy(xpath = "//input[@id='outlined-basic']")
public static WebElement firstName;

@FindBy(xpath = "(//input[@id='outlined-basic'])[2]")
public static WebElement lastName;

@FindBy(xpath = "//input[@id='headline']")
public static WebElement headLine;

@FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer'][2]")
public static WebElement clickOnDropDown;

@FindBy(xpath = "//div[5][@class=' css-yt9ioa-option']")
public static WebElement animation;

@FindBy(xpath = "(//input[@placeholder='Select year'])[1]")
public static WebElement selectYear;

@FindBy(xpath = "(//button[@class='ant-picker-header-super-prev-btn'])[1]")
public static WebElement arrow;

@FindBy(xpath = "(//div[normalize-space()='2015'])[1]")
public static WebElement year;

@FindBy(xpath = "//input[@value='fresher'][@type='radio']")
public static WebElement fresher;

@FindBy(xpath = "//input[@class='basic_search react-e2e-async-select__input']")
public static WebElement enterCity;

@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']")
public static WebElement noticePeriod;

@FindBy(xpath = "//li[@id='auto-highlight-option-0']")
public static WebElement joiningImmediately;

@FindBy(xpath = "//div[@id='Save']")
public static WebElement save;















}
