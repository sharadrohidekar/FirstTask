package com.automation.stepdef;

import org.openqa.selenium.Keys;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringLoginPage;
import com.automation.pages.e2eHiringProfilePage;
import com.automation.pages.e2eHiringProjectsPage;

import io.cucumber.java.en.*;

public class e2eHiringProjects extends Base {
	
	
e2eHiringProjectsPage profile = new e2eHiringProjectsPage();
	
@Then("user clicks on projects")
public void user_clicks_on_projects() throws InterruptedException {
	 Waits.tryJavascript("window.scrollBy(0,800)");
	  	Thread.sleep(2000);
	  
    Elements.click(e2eHiringProjectsPage.projects);
    Thread.sleep(2000);
}

@Then("user add on to the project")
public void user_add_on_to_the_project() throws InterruptedException {
	Waits.tryJavascript("window.scrollBy(0,500)");
  	Thread.sleep(2000);
    Elements.click(e2eHiringProjectsPage.addProjects);
    Thread.sleep(2000);
}
@Then("user enters project name {string}")
public void user_enters_project_name(String string) throws InterruptedException {
    Elements.TypeText(e2eHiringProjectsPage.projectName, string);
    Thread.sleep(2000);
}
@Then("user enters role {string}")
public void user_enters_role(String string) throws InterruptedException {
    Elements.TypeText(e2eHiringProjectsPage.role, string);
    Thread.sleep(2000);
    
}
@Then("user enters client name {string}")
public void user_enters_client_name(String string) throws InterruptedException {
    Elements.TypeText(e2eHiringProjectsPage.client, string);
    Thread.sleep(2000);
    Waits.tryJavascript("window.scrollBy(0,500)");
  	Thread.sleep(2000);
   	
}
@Then("user selects {int} year duration")
public void user_selects_year_duration(Integer int1) throws InterruptedException {
    Elements.click(e2eHiringProjectsPage.durationStart);
    Thread.sleep(2000);
    Elements.click(e2eHiringProjectsPage.oneYear);
    Thread.sleep(2000);
}
@Then("user selects {int} months")
public void user_selects_months(Integer int1) throws InterruptedException {
	Elements.click(e2eHiringProjectsPage.durationEnds);
	Thread.sleep(2000);
    Elements.click(e2eHiringProjectsPage.zeroMonth);
    Thread.sleep(2000);
}
@Then("user enters technology name {string}")
public void user_enters_technology_name(String string) throws InterruptedException {
    Elements.TypeText(e2eHiringProjectsPage.technology, string);
    Thread.sleep(2000);
}
@Then("user enters project description {string}")
public void user_enters_project_description(String string) throws InterruptedException {
    Elements.TypeText(e2eHiringProjectsPage.projectDesc, string);
    Thread.sleep(2000);
    Waits.tryJavascript("window.scrollBy(0,500)");
  	Thread.sleep(2000);
   	
}
@Then("user clicks on project save")
public void user_clicks_on_project_save() throws InterruptedException {
    Elements.click(e2eHiringProjectsPage.saveProject);
    Thread.sleep(2000);
}



}
