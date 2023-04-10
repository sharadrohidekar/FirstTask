package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Login.feature",
	    "classpath:FeatureFiles/Profile.feature",
     	"classpath:FeatureFiles/Contact.feature",
		"classpath:FeatureFiles/ResumeUpload.feature",
		"classpath:FeatureFiles/Links.feature",
		"classpath:FeatureFiles/About.feature",
		"classpath:FeatureFiles/Skills.feature",
		"classpath:FeatureFiles/Education.feature",
		"classpath:FeatureFiles/JobPreference.feature",
		"classpath:FeatureFiles/Certifications.feature",
		"classpath:FeatureFiles/WorkExperience.feature",
		"classpath:FeatureFiles/TrainingInstitution.feature",
		"classpath:FeatureFiles/Projects.feature",
		"classpath:FeatureFiles/PersonalInformation.feature"	
//		"classpath:FeatureFiles/CoverStory.feature",
		},

glue={"classpath:com.automation.stepdef"},	
plugin={"html:target/cucumber"})
//tags= {"@Profile"})

public class Runner {
	
}