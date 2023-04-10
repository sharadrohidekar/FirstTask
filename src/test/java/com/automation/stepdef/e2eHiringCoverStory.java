package com.automation.stepdef;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringCoverStoryPage;
import com.automation.pages.e2eHiringLoginPage;
import com.automation.pages.e2eHiringProfilePage;

import io.cucumber.java.en.*;

public class e2eHiringCoverStory extends Base {
	
	
e2eHiringCoverStoryPage profile = new e2eHiringCoverStoryPage();
	
@Then("user clicks on Cover story")
public void user_clicks_on_cover_story() throws InterruptedException {
  Elements.click(e2eHiringCoverStoryPage.CoverStory);
  Thread.sleep(2000);
	Waits.tryJavascript("window.scrollBy(0,300)");
	Thread.sleep(2000);
}

@Then("user clicks on Upload")
public void user_clicks_on_upload_create() throws InterruptedException {
    Elements.click(e2eHiringCoverStoryPage.upload);
    Thread.sleep(2000);
}
@Then("user selects upload video")
public void user_selects_upload_video() throws InterruptedException {
    Elements.click(e2eHiringCoverStoryPage.uploadVideo);
    Thread.sleep(2000);
}
@Then("user clicks on BrowseFiles")
public void user_clicks_on_browse_files() throws InterruptedException {
   Elements.click(e2eHiringCoverStoryPage.browseFiles);
   Thread.sleep(2000);
}
@Then("selects files and upload")
public void selects_files_and_upload() {
 //  Elements.TypeText(e2eHiringCoverStoryPage., null);
}
@Then("user clicks on subbmit button")
public void user_clicks_on_subbmit_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
