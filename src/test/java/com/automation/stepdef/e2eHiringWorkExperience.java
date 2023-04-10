package com.automation.stepdef;




import org.openqa.selenium.Keys;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringWorkExperiencePage;

import io.cucumber.java.en.*;

public class e2eHiringWorkExperience extends Base {
	
	
e2eHiringWorkExperiencePage profile = new e2eHiringWorkExperiencePage();
	
@Then("user clicks on work experience")
public void user_clicks_on_work_experience() throws InterruptedException {
	 Waits.tryJavascript("window.scrollBy(0,800)");
	 	Thread.sleep(2000);
    Elements.click(e2eHiringWorkExperiencePage.workExp);
    Thread.sleep(2000);
}

@Then("user clicks on add work exp button")
public void user_clicks_on_add_work_exp_button() throws InterruptedException {
	 Waits.tryJavascript("window.scrollBy(0,500)");
	 	Thread.sleep(2000);
  Elements.click(e2eHiringWorkExperiencePage.add);
  Thread.sleep(2000);
}

@Then("user enters company name {string}")
public void user_enters_company_name(String string) throws InterruptedException {
	Elements.click(e2eHiringWorkExperiencePage.company);
	Thread.sleep(2000);
   Elements.TypeText(e2eHiringWorkExperiencePage.company, string);
   Thread.sleep(2000);
   Waits.tryJavascript("window.scrollBy(0,500)");
  	Thread.sleep(2000);
 Elements.click(e2eHiringWorkExperiencePage.companyName);
 Thread.sleep(2000);
}

@Then("user clicks on current company")
public void user_clicks_on_current_company() throws InterruptedException {
   Elements.click(e2eHiringWorkExperiencePage.no);
   Thread.sleep(2000);
 
}

@Then("user selects Animation")
public void user_selects_animation() throws InterruptedException {
	
   Elements.click(e2eHiringWorkExperiencePage.industry);
   Thread.sleep(2000);
   Elements.click(e2eHiringWorkExperiencePage.animate);
   Thread.sleep(2000);
}

@Then("user selects designation Csa")
public void user_selects_designation_csa() throws InterruptedException {
    Elements.click(e2eHiringWorkExperiencePage.designation);
    Thread.sleep(2000);
    Elements.click(e2eHiringWorkExperiencePage.csa);
    Thread.sleep(2000);
}


@Then("user clicks on work from")
public void user_clicks_on_work_from() throws InterruptedException {
  Elements.click(e2eHiringWorkExperiencePage.workFromexp);
  Thread.sleep(2000);
}

@Then("user clicks on a year {string}")
public void user_clicks_on_a_year(String string) throws InterruptedException {
	Elements.click(e2eHiringWorkExperiencePage.fromYear);
	Thread.sleep(2000);
	Elements.selectByValue(e2eHiringWorkExperiencePage.fromYear, string);
	Thread.sleep(2000);
	
}
@And("user clicks onto the month {string}")
public void user_clicks_onto_the_month(String string) throws InterruptedException {
	Elements.click(e2eHiringWorkExperiencePage.fromMonth);
	Thread.sleep(2000);
	Elements.selectByValue(e2eHiringWorkExperiencePage.fromMonth, string);
	Thread.sleep(2000);
}

@Then("user clicks on 13th")
public void user_clicks_on_13th() throws InterruptedException {
   Elements.click(e2eHiringWorkExperiencePage.fromDate);
   Thread.sleep(2000);
}

@Then("user clicks onto the year {string}")
public void user_clicks_onto_the_year(String string) throws InterruptedException {
	Elements.click(e2eHiringWorkExperiencePage.tillWorkExp);
	Thread.sleep(2000);	
	Elements.click(e2eHiringWorkExperiencePage.tillYear);
	Thread.sleep(2000);
	Elements.selectByValue(e2eHiringWorkExperiencePage.tillYear, string);
	Thread.sleep(2000);
	
}

@And("user clicks on a month {string}")
public void user_clicks_on_a_month(String string) throws InterruptedException {
	Elements.click(e2eHiringWorkExperiencePage.tillMonth);
	Thread.sleep(2000);
	Elements.selectByValue(e2eHiringWorkExperiencePage.tillMonth, string);
	Thread.sleep(2000);
}

@Then("user clicks on the 7th")
public void user_clicks_on_the_7th() throws InterruptedException {
   Elements.click(e2eHiringWorkExperiencePage.tillDate);
   Thread.sleep(2000);
}

@And("user clicks on saveExp")
public void user_clicks_on_saveExp() throws InterruptedException {
Elements.click(e2eHiringWorkExperiencePage.saveWorkExp);
Thread.sleep(2000);
}

}
