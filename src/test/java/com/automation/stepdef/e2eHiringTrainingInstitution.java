package com.automation.stepdef;

import org.openqa.selenium.Keys;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringLoginPage;
import com.automation.pages.e2eHiringProfilePage;
import com.automation.pages.e2eHiringTrainingInstitutionPage;

import io.cucumber.java.en.*;

public class e2eHiringTrainingInstitution extends Base {
	
	
e2eHiringTrainingInstitutionPage profile = new e2eHiringTrainingInstitutionPage();
	
@Then("user clicks on Training Institution")
public void user_clicks_on_training_institution() throws InterruptedException {
	 Waits.tryJavascript("window.scrollBy(0,1000)");
	  	Thread.sleep(2000);
 Elements.click(e2eHiringTrainingInstitutionPage.trainInst);
 Thread.sleep(2000);
}

@Then("user clicks on add TI")
public void user_clicks_on_add_ti() throws InterruptedException {
	 Waits.tryJavascript("window.scrollBy(0,500)");
	  	Thread.sleep(2000);
	  	Elements.click(e2eHiringTrainingInstitutionPage.addTI);
	  	Thread.sleep(2000);
}
@Then("user enters to {string}")
public void user_enters_to_automation_testing(String string) throws InterruptedException {
    Elements.TypeText(e2eHiringTrainingInstitutionPage.trainingName, string);
    Thread.sleep(2000);
    
}
@Then("user enters {string}")
public void user_enters_krn_informatix(String string) throws InterruptedException {
	Elements.TypeText(e2eHiringTrainingInstitutionPage.institute, string);
	Thread.sleep(2000);
	Elements.KeyboardEnter(e2eHiringTrainingInstitutionPage.institute);
	Thread.sleep(2000);
	 Waits.tryJavascript("window.scrollBy(0,500)");
	  	Thread.sleep(2000);
	
	
}
@Then("user clicks on No to current institute")
public void user_clicks_on_no_to_current_institute() throws InterruptedException {
	 Elements.click(e2eHiringTrainingInstitutionPage.no);
	   Thread.sleep(2000);
}
@Then("user clicks on start date")
public void user_clicks_on_start_date() throws InterruptedException {
    Elements.click(e2eHiringTrainingInstitutionPage.startDate);
    Thread.sleep(2000);
}
@Then("user selects year {string}")
public void user_selects_year(String string) throws InterruptedException {
    Elements.click(e2eHiringTrainingInstitutionPage.startYear);
    Thread.sleep(2000);
    Elements.selectByValue(e2eHiringTrainingInstitutionPage.startYear, string);
    Thread.sleep(2000);
}
@Then("user selects month {string}")
public void user_selects_month(String string) throws InterruptedException {
    Elements.click(e2eHiringTrainingInstitutionPage.startMonth);
    Thread.sleep(2000);
    Elements.selectByValue(e2eHiringTrainingInstitutionPage.startMonth, string);
    Thread.sleep(2000);
}
@Then("user clicks on date 6th")
public void user_clicks_on_date_6th() throws InterruptedException {
   Elements.click(e2eHiringTrainingInstitutionPage.selectDate);
   Thread.sleep(2000);
}
@Then("user clicks on 	End date")
public void user_clicks_on_end_date() throws InterruptedException {
 Elements.click(e2eHiringTrainingInstitutionPage.endDate);
 Thread.sleep(2000);
}

@Then("user selects the year {string}")
public void user_selects_the_year(String string) throws InterruptedException {
	Elements.click(e2eHiringTrainingInstitutionPage.endYear);
	Thread.sleep(2000);
	Elements.selectByValue(e2eHiringTrainingInstitutionPage.endYear, string);
	Thread.sleep(2000);
}

@And("user selects the month {string}")
public void user_selects_the_month(String string) throws InterruptedException {
	Elements.click(e2eHiringTrainingInstitutionPage.endMonthOn);
	Thread.sleep(2000);
	Elements.selectByValue(e2eHiringTrainingInstitutionPage.endMonthOn, string);
	Thread.sleep(2000);
}
		
@Then("user clicks on date 30th")
public void user_clicks_on_date_30th() throws InterruptedException {
  Elements.click(e2eHiringTrainingInstitutionPage.enterDate);
  Thread.sleep(2000);
}
@Then("user enters description as {string}")
public void user_enters_description_as(String string) throws InterruptedException {
   Elements.TypeText(e2eHiringTrainingInstitutionPage.description, string);
   Thread.sleep(2000);
}
@Then("user clicks on save TI")
public void user_clicks_on_save_ti() throws InterruptedException {
	 Waits.tryJavascript("window.scrollBy(0,500)");
	  	Thread.sleep(2000);
	  
   Elements.click(e2eHiringTrainingInstitutionPage.saveTI);
   Thread.sleep(2000);
}

}
