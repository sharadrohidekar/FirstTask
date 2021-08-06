package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class ClickNavItemsPage {
	
public ClickNavItemsPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	public static WebElement HomeNav;
	
	@FindBy(xpath="//li[@class='nav-item nav-link submenu']//a[normalize-space()='Services']")
	public static WebElement ServicesNav;
	
	@FindBy(xpath="//a[normalize-space()='Products']")
	public static WebElement ProductsNav;
	
	@FindBy(xpath="//a[normalize-space()='About Us']")
	public static WebElement AboutUsNav;
	
	@FindBy(xpath="//a[normalize-space()='Case Studies']")
	public static WebElement CaseStudiesNav;
	
	@FindBy(xpath="//a[normalize-space()='Blogs']")
	public static WebElement BlogsNav;
	
	@FindBy(xpath="//a[normalize-space()='Careers']")
	public static WebElement CareersNav;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	public static WebElement ContactUsNav;

	

}
