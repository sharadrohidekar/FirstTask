package com.automation.stepdef;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringAboutPage;
import com.automation.pages.e2eHiringLoginPage;
import com.automation.pages.e2eHiringProfilePage;

import io.cucumber.java.en.*;

public class e2eHiringAbout extends Base {
	
	
e2eHiringAboutPage profile = new e2eHiringAboutPage();
	
@Then("user clicks on About")
public void user_clicks_on_about() throws InterruptedException {
    Elements.click(e2eHiringAboutPage.about);
    Thread.sleep(2000);
    Waits.tryJavascript("window.scrollBy(0,200)");
   	Thread.sleep(2000);
}

@Then("user enters details inside about section {string}")
public void user_enters_details_inside_about_section(String string) throws InterruptedException {
	Elements.clearTxtBox(e2eHiringAboutPage.inputData);
	Thread.sleep(2000);
   Elements.TypeText(e2eHiringAboutPage.inputData, string);
   Thread.sleep(2000);
   Waits.tryJavascript("window.scrollBy(0,200)");
	Thread.sleep(2000);
}
@Then("user clicks on save about")
public void user_clicks_on_save_about() throws InterruptedException {
   Elements.click(e2eHiringAboutPage.saveAbout);
   Thread.sleep(2000);
}





}
