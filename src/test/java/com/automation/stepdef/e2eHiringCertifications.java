package com.automation.stepdef;

import com.automation.base.Base;

import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringCertificationsPage;


import io.cucumber.java.en.*;

public class e2eHiringCertifications extends Base {
	
	
e2eHiringCertificationsPage profile = new e2eHiringCertificationsPage();

@Then("user clicks on certifications")
public void user_clicks_on_certifications() throws InterruptedException {
	Waits.tryJavascript("window.scrollBy(0,200)");
	Thread.sleep(2000);
    Elements.click(e2eHiringCertificationsPage.certifications);
    Thread.sleep(2000);
   
}

@Then("user clicks on edit certification")
public void user_clicks_on_edit_certification() throws InterruptedException {
	Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
  Elements.click(e2eHiringCertificationsPage.addCertification);
  Thread.sleep(2000);
}

@Then("user enters certification Name {string}")
public void user_enters_certification_name(String string) throws InterruptedException {
    Elements.TypeText(e2eHiringCertificationsPage.certificationName, string);
    Thread.sleep(2000);
}
@Then("user enters certifiedby {string}")
public void user_enters_certifiedby(String string) throws InterruptedException {
    Elements.TypeText(e2eHiringCertificationsPage.certifiedBy, string);
    Thread.sleep(2000);
}
@Then("user enters Link optional {string}")
public void user_enters_link_optional(String string) throws InterruptedException {
   Elements.TypeText(e2eHiringCertificationsPage.linkOptional, string);
   Thread.sleep(2000);
   Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
}

@Then("user clicks on issued on")
public void user_clicks_on_issued_on() throws InterruptedException {
    Elements.click(e2eHiringCertificationsPage.issuedOn);
    Thread.sleep(2000);
}
@Then("user clicks on year {string}")
public void user_clicks_on_year(String string) throws InterruptedException {
    Elements.click(e2eHiringCertificationsPage.clickyear);
    Thread.sleep(2000);
    Elements.selectByValue(e2eHiringCertificationsPage.clickyear, string);
    Thread.sleep(2000);
}

@Then("user clicks on month {string}")
public void user_clicks_on_month(String string) throws InterruptedException {
	 Elements.click(e2eHiringCertificationsPage.clickOnMonth);
	 Thread.sleep(2000);
	 Elements.selectByValue(e2eHiringCertificationsPage.clickOnMonth, string);
	 Thread.sleep(2000);
}

@Then("user clicks on 30th")
public void user_clicks_on_30th() throws InterruptedException {
   Elements.click(e2eHiringCertificationsPage.clickDate);
   Thread.sleep(2000);
}

@Then("user clicks on valid till")
public void user_clicks_on_valid_till() throws InterruptedException {
   Elements.click(e2eHiringCertificationsPage.validTill);
   Thread.sleep(2000);
   Waits.tryJavascript("window.scrollBy(0,-500)");
 	Thread.sleep(2000);
}

@Then("user clicks on the year {string}")
public void user_clicks_on_the_year(String string) throws InterruptedException {
	  Elements.click(e2eHiringCertificationsPage.yearclick);
	    Thread.sleep(2000);
	    Elements.selectByValue(e2eHiringCertificationsPage.yearclick, string);
	    Thread.sleep(2000);
}

@Then("user clicks on the month {string}")
public void user_clicks_on_the_month(String string) throws InterruptedException {
	  Elements.click(e2eHiringCertificationsPage.monthClick);
	    Thread.sleep(2000);
	    Elements.selectByValue(e2eHiringCertificationsPage.monthClick, string);
	    Thread.sleep(2000);
}

@Then("user clicks on date 31st")
public void user_clicks_on_date_31st() throws InterruptedException {
	 Waits.tryJavascript("window.scrollBy(0,500)");
	 	Thread.sleep(2000);
	Elements.click(e2eHiringCertificationsPage.dateClick);
	   Thread.sleep(2000);
}
@Then("user enters grade {string}")
public void user_enters_grade(String string) throws InterruptedException {
   Elements.TypeText(e2eHiringCertificationsPage.grade, string);
   Thread.sleep(2000);
   Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
}
@Then("user clicks on checkbox Lifetime Validity")
public void user_clicks_on_checkbox_Lifetime_Validity() throws InterruptedException {
   Elements.click(e2eHiringCertificationsPage.lifeTimeValidity);
   Thread.sleep(2000);
}
@Then("user clicks on Save button on certification")
public void user_clicks_on_save_button_on_certification() throws InterruptedException {
   Elements.click(e2eHiringCertificationsPage.clickOnSave);
   Thread.sleep(2000);
}






































}
