package com.automation.stepdef;

import org.openqa.selenium.Alert;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringContactdetailsPage;


import io.cucumber.java.en.*;

public class e2eHiringcontactdetails extends Base {
	
e2eHiringContactdetailsPage contact=new e2eHiringContactdetailsPage();

@Then("user clicks on phone number")
public void user_clicks_on_phone_number() throws InterruptedException {
 
  Elements.click(e2eHiringContactdetailsPage.phoneNumber);
  Thread.sleep(2000);
  Waits.tryJavascript("window.scrollBy(0,500)");
 
  }

@Then("user clicks on edit button")
public void user_clicks_on_edit_button() throws InterruptedException {
	
	Elements.click(e2eHiringContactdetailsPage.editButton);
    Thread.sleep(2000);
}
@Then("user enters phone number {string}")
public void user_enters_phone_number(String string) throws InterruptedException {
	Elements.clearTxtBox(e2eHiringContactdetailsPage.enterPhoneNumber);
	Thread.sleep(2000);
   Elements.TypeText(e2eHiringContactdetailsPage.enterPhoneNumber, string);
   Thread.sleep(2000);
   Waits.tryJavascript("window.scrollBy(0,300)");
   
 
}

@Then("user clicks on send OTP")
public void user_clicks_on_send_otp() throws InterruptedException {
	  Elements.click(e2eHiringContactdetailsPage.sendOTP);
	   Thread.sleep(2000);
}

@Then("user clicks on cancel button")
public void user_clicks_on_cancel_button() throws InterruptedException {
    Elements.click(e2eHiringContactdetailsPage.cancel);
    Thread.sleep(2000);
}
}
