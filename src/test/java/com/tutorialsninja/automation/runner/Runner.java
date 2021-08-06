package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Navigate.feature","classpath:FeatureFiles/ClickNavItems.feature","classpath:FeatureFiles/EnterEmail.feature","classpath:FeatureFiles/ContactUs.feature"},
glue={"classpath:com.tutorialsninja.automation.stepdef"},
plugin={"html:target/cucumber_html_report"})
//tags= {"@ContactUs","@One"})
public class Runner {
	
}