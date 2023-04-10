package com.automation.stepdef;

import org.openqa.selenium.Keys;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringLoginPage;
import com.automation.pages.e2eHiringPersonalInformationPage;
import com.automation.pages.e2eHiringProfilePage;

import io.cucumber.java.en.*;

public class e2eHiringPeronalInformation extends Base {
	
	
e2eHiringPersonalInformationPage profile = new e2eHiringPersonalInformationPage();
	
@Then("user clicks on Personal Information")
public void user_clicks_on_personal_information() throws InterruptedException {
	 Waits.tryJavascript("window.scrollBy(0,800)");
	 Thread.sleep(2000);
	
	Elements.click(e2eHiringPersonalInformationPage.personalInformation);
   Thread.sleep(2000);
}

@Then("user clicks on add personal")
public void user_clicks_on_add_personal() throws InterruptedException {
	 Waits.tryJavascript("window.scrollBy(0,300)");
	 Thread.sleep(2000);
	
 Elements.click(e2eHiringPersonalInformationPage.addPI);
 Thread.sleep(2000);
}

@Then("user clicks on male")
public void user_clicks_on_male() throws InterruptedException {
	if(!Elements.isSelected(e2eHiringPersonalInformationPage.maleIn))
	{
   Elements.click(e2eHiringPersonalInformationPage.maleIn);
	}
   Thread.sleep(2000);
   Waits.tryJavascript("window.scrollBy(0,200)");
	 Thread.sleep(2000);
}

@Then("user enters language {string}")
public void user_enters_language(String string) throws InterruptedException {
	Elements.TypeText(e2eHiringPersonalInformationPage.language, string);
	Thread.sleep(2000);
	Waits.tryJavascript("window.scrollBy(0,200)");
	 Thread.sleep(2000);
	 Elements.click(e2eHiringPersonalInformationPage.kannada);
	 Thread.sleep(2000);
		 
}

@Then("user enters pincode {string}")
public void user_enters_pincode(String string) throws InterruptedException {
	Elements.clearTxtBox(e2eHiringPersonalInformationPage.pincode);
	Thread.sleep(2000);
    Elements.TypeText(e2eHiringPersonalInformationPage.pincode, string);
    Thread.sleep(2000);
    Waits.tryJavascript("window.scrollBy(0,200)");
    Thread.sleep(2000);
    Elements.ActionsClass(e2eHiringPersonalInformationPage.pincode);
    Thread.sleep(2000);
    Waits.tryJavascript("window.scrollBy(0,500)");
    Thread.sleep(2000);

}

 
@Then("user clicks on save PI")
public void user_clicks_on_save_pi() throws InterruptedException {
   Elements.click(e2eHiringPersonalInformationPage.savePI);
   Thread.sleep(2000);
}

}
