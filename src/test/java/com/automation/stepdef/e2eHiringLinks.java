package com.automation.stepdef;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringLinksPage;
import com.automation.pages.e2eHiringLoginPage;
import com.automation.pages.e2eHiringProfilePage;

import io.cucumber.java.en.*;

public class e2eHiringLinks extends Base {
	
	
e2eHiringLinksPage profile = new e2eHiringLinksPage();
	
@Then("user clicks on links")
public void user_clicks_on_links() throws InterruptedException {

	
   Elements.click(e2eHiringLinksPage.links);
   Thread.sleep(2000);
}

@Then("user enters github link {string}")
public void user_enters_github_link(String string) throws InterruptedException {
    Elements.TypeText(e2eHiringLinksPage.github, string);
    Thread.sleep(2000);
}
@Then("user enters linkedin link {string}")
public void user_enters_linkedin_link(String string) throws InterruptedException {
    Elements.TypeText(e2eHiringLinksPage.linkedin, string);
    Thread.sleep(2000);
    Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
}

@Then("user clicks on savebutton")
public void user_clicks_on_savebutton() {
	Elements.click(e2eHiringLinksPage.savelink);
}
    
	

}
