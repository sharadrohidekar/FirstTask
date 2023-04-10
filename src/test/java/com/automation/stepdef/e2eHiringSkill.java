package com.automation.stepdef;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringLoginPage;
import com.automation.pages.e2eHiringProfilePage;
import com.automation.pages.e2eHiringSkillPage;

import io.cucumber.java.en.*;

public class e2eHiringSkill extends Base {
	
	
e2eHiringSkillPage profile = new e2eHiringSkillPage();
	
@Then("user clicks on skill")
public void user_clicks_on_skill() throws InterruptedException {
   Elements.click(e2eHiringSkillPage.skill);
   Thread.sleep(2000);

}

@Then("user click on edit skill button")
public void user_click_on_edit_skill_button() throws InterruptedException {
	Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
   Elements.click(e2eHiringSkillPage.editSkill);
   Thread.sleep(2000);
}
@Then("user enters skill {string} {string} {string}")
public void user_enters_skill(String string, String string2, String string3) throws InterruptedException {
    Elements.TypeText(e2eHiringSkillPage.addSkill, string3);
    Thread.sleep(2000);
}
@Then("user clicks on enter")
public void user_clicks_on_enter() throws InterruptedException {
	Waits.tryJavascript("window.scrollBy(0,300)");
	Thread.sleep(2000);
  Elements.click(e2eHiringSkillPage.saveSkill);
  Thread.sleep(2000);
}

}
