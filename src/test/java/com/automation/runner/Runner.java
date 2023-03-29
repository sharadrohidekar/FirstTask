package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/ScenarioA.feature","classpath:FeatureFiles/ScenarioA2.feature" },
glue={"classpath:com.automation.stepdef"},
plugin={"html:target/cucumber"})

public class Runner {
	
}