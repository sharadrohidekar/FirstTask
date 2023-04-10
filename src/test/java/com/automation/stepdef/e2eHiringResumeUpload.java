package com.automation.stepdef;


import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringResumeUploadPage;

import io.cucumber.java.en.*;

public class e2eHiringResumeUpload extends Base {
	
	
e2eHiringResumeUploadPage profile = new e2eHiringResumeUploadPage();
	
@Then("user clicks on resume upload")
public void user_clicks_on_resume_upload() throws InterruptedException {
   Elements.click(e2eHiringResumeUploadPage.resumeUpload);
   Thread.sleep(2000);
   Waits.tryJavascript("window.scrollBy(0,800)");
}

@Then("user clicks on update resume")
public void user_clicks_on_update_resume() throws InterruptedException {
   Elements.click(e2eHiringResumeUploadPage.updateResumeButton);
   Thread.sleep(2000);
}

@Then("user clicks on Drop your resume here or Browse {string}")
public void user_clicks_on_drop_your_resume_here_or_browse(String string) throws InterruptedException {
    Elements.TypeText(e2eHiringResumeUploadPage.browser, string);
    Thread.sleep(2000);

}

@Then("user clicks on submit button")
public void user_clicks_on_submit_button() throws InterruptedException {
   Elements.click(e2eHiringResumeUploadPage.submit);
   Thread.sleep(2000);
}



}
