package com.automation.stepdef;




import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringEducationPage;


import io.cucumber.java.en.*;

public class e2eHiringEducation extends Base {
	
	
e2eHiringEducationPage profile = new e2eHiringEducationPage();

@And("user clicks on Education")
public void user_clicks_on_Education() throws InterruptedException {
	Waits.tryJavascript("window.scrollBy(0,200)");
	Thread.sleep(2000);
 Elements.click(e2eHiringEducationPage.Education);  
 Thread.sleep(2000);
}	

@Then("user clicks on add button")
public void user_clicks_on_add_button() throws InterruptedException {
	Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	Elements.click(e2eHiringEducationPage.editEdu);  
 Thread.sleep(2000);
}

@Then("user enters schoolname {string}")
public void user_enters_schoolname(String string) throws InterruptedException {
  Elements.TypeText(e2eHiringEducationPage.school, string);
  Thread.sleep(2000);
  Elements.KeyboardEnter(e2eHiringEducationPage.school);
  Thread.sleep(2000);
}
@Then("user clicks on degree")
public void user_clicks_on_degree() throws InterruptedException {
	Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
   Elements.click(e2eHiringEducationPage.degree);
   Thread.sleep(2000);
}
@Then("user selects Post Graduate Diploma")
public void user_selects_post_graduate_diploma() throws InterruptedException {
   Elements.click(e2eHiringEducationPage.PGD);
   Thread.sleep(2000);
}
@Then("user selects Mechanical Engineering")
public void user_selects_mechanical_engineering() throws InterruptedException {
   Elements.click(e2eHiringEducationPage.specialization);
   Thread.sleep(2000);
   Elements.click(e2eHiringEducationPage.mechanical);
   Thread.sleep(2000);
}
@Then("user clicks on Passing year")
public void user_clicks_on_passing_year() throws InterruptedException {
	
	Elements.click(e2eHiringEducationPage.passingYear);
	Thread.sleep(2000);
	Waits.tryJavascript("window.scrollBy(0,200)");
	Thread.sleep(2000);
	Elements.click(e2eHiringEducationPage.leftArrow);
	Thread.sleep(2000);
	Elements.click(e2eHiringEducationPage.yearSelected);
	Thread.sleep(2000);
	
}

@Then("user clicks CGPA score")
public void user_clicks_cgpa_score() throws InterruptedException {
  Elements.click(e2eHiringEducationPage.scorePath);
  Thread.sleep(2000);
  Elements.click(e2eHiringEducationPage.selectCGPA);
  Thread.sleep(2000);
}

@Then("user enters score {string}")
public void user_enters_score(String string) throws InterruptedException {
	Elements.TypeText(e2eHiringEducationPage.enterCGPA, string);
	Thread.sleep(2000);
	Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
  
}
@Then("user clicks medium English")
public void user_clicks_medium_english() throws InterruptedException {
	Elements.click(e2eHiringEducationPage.medium);
	Thread.sleep(2000);
	Elements.click(e2eHiringEducationPage.english);
	Thread.sleep(2000);
  
}
@Then("user clicks Course Type Full Time")
public void user_clicks_course_type_full_time() throws InterruptedException {
	Elements.click(e2eHiringEducationPage.fullTime);
	Thread.sleep(2000);
   
}
@Then("user clicks on save education")
public void user_clicks_on_save_education() throws InterruptedException {
   Elements.click(e2eHiringEducationPage.saveEdu);
}

}
