package com.automation.stepdef;

import com.automation.base.Base;

import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringJobPreferencePage;


import io.cucumber.java.en.*;

public class e2eHiringJobPreference extends Base {
	
	
e2eHiringJobPreferencePage profile = new e2eHiringJobPreferencePage();

@Then("user clicks on JobPreference")
public void user_clicks_on_JobPreference() throws InterruptedException {
	Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
   Elements.click(e2eHiringJobPreferencePage.jobPreference);
   Thread.sleep(2000);
}
	
@Then("user clicks on editjob")
public void user_clicks_on_editjob() throws InterruptedException {
	Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
   Elements.click(e2eHiringJobPreferencePage.editJob);
   Thread.sleep(2000);
}

@Then("user clicks on fulltime")
public void user_clicks_on_fulltime() throws InterruptedException {
   Elements.click(e2eHiringJobPreferencePage.fullTimejob);
   Thread.sleep(2000);
   Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	
}
@Then("user clicks on work from office")
public void user_clicks_on_work_from_office() throws InterruptedException {
  if(!Elements.isSelected(e2eHiringJobPreferencePage.workFromOffice))
  {
	  Elements.click(e2eHiringJobPreferencePage.workFromOffice);
  }
  Thread.sleep(2000);
  Elements.clearTxtBox(e2eHiringJobPreferencePage.enterCity);
  Thread.sleep(2000);
 
}


@Then("user clicks on enter the location {string}")
public void user_clicks_on_enter_the_location(String string) throws InterruptedException {
   Elements.TypeText(e2eHiringJobPreferencePage.enterCity, string);
   Thread.sleep(2000);
   Elements.KeyboardEnter(e2eHiringJobPreferencePage.enterCity);
   Thread.sleep(2000);
   Waits.tryJavascript("window.scrollBy(0,300)");
   Thread.sleep(2000);
}

@Then("user clicks on current salary")
public void user_clicks_on_current_salary() throws InterruptedException {
   Elements.click(e2eHiringJobPreferencePage.currentSalaryFrom);
   Thread.sleep(2000);
   Elements.click(e2eHiringJobPreferencePage.currentSalaryValue);
   Thread.sleep(2000);
   Elements.click(e2eHiringJobPreferencePage.currentSalaryTo);
   Thread.sleep(2000);
   Elements.click(e2eHiringJobPreferencePage.currentSalaryValueto);
   Thread.sleep(2000);
   
   
   
   
   
}
@Then("user clicks on expected salary")
public void user_clicks_on_expected_salary() throws InterruptedException {
	Elements.click(e2eHiringJobPreferencePage.expectedSalaryFrom);
	   Thread.sleep(2000);
	   Elements.click(e2eHiringJobPreferencePage.expectedSalaryValue);
	   Thread.sleep(2000);
	   Elements.click(e2eHiringJobPreferencePage.expectedSalaryTo);
	   Thread.sleep(2000);
	   Elements.click(e2eHiringJobPreferencePage.expectedSalaryValueto);
	   Thread.sleep(2000);
	   Waits.tryJavascript("window.scrollBy(0,300)");
	   Thread.sleep(2000);
	   
}
@Then("user saves it.")
public void user_saves_it() throws InterruptedException {
   Elements.click(e2eHiringJobPreferencePage.saveit);
   Thread.sleep(2000);
}

}