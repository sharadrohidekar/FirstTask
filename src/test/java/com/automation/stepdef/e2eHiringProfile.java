package com.automation.stepdef;

import org.openqa.selenium.Keys;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.e2eHiringLoginPage;
import com.automation.pages.e2eHiringProfilePage;

import io.cucumber.java.en.*;

public class e2eHiringProfile extends Base {
	
	
e2eHiringProfilePage profile = new e2eHiringProfilePage();
	
	@Then("user is in home page")
	public void user_is_in_home_page() {
	 System.out.println(Elements.getCurrentUrl());
		
	}

	@When("user clicks on profile")
	public void user_clicks_on_profile() throws InterruptedException {
	  Elements.click(e2eHiringProfilePage.Me);
	  Thread.sleep(2000);
		
	}
	
	@Then("user clicks on view profile")
	public void user_clicks_on_view_profile() throws InterruptedException {
	Elements.click(e2eHiringProfilePage.viewProfile);
	Thread.sleep(2000);

	Waits.tryJavascript("window.scrollBy(0,500)");
	Thread.sleep(2000);
		
	}
		
	@Then("user enters first name {string}")
	public void user_enters_first_name(String string) throws InterruptedException {
		Elements.clearTxtBox(e2eHiringProfilePage.firstName);
		Thread.sleep(2000);
		Elements.TypeText(e2eHiringProfilePage.firstName, string);
		Thread.sleep(2000);
		Waits.tryJavascript("window.scrollBy(0,500)");
	}
	
	@Then("user enters last name {string}")
	public void user_enters_last_name(String string) throws InterruptedException {
		Elements.clearTxtBox(e2eHiringProfilePage.lastName);
		Thread.sleep(2000);
	   Elements.TypeText(e2eHiringProfilePage.lastName, string);
	   Thread.sleep(2000);
	   Waits.tryJavascript("window.scrollBy(0,500)");
	}
	@Then("user enters headline {string}")
	public void user_enters_headline(String string) throws InterruptedException {
		Waits.tryJavascript("window.scrollBy(0,500)");
		Elements.clearTxtBox(e2eHiringProfilePage.headLine);
		Thread.sleep(2000);
	    Elements.TypeText(e2eHiringProfilePage.headLine, string);
	    Thread.sleep(2000);
	    Waits.tryJavascript("window.scrollBy(0,500)");
	    Thread.sleep(2000);
	    
	}
	@Then("user clicks on Industry and selects Animation")
	public void user_clicks_on_industry_and_selects_animation() throws InterruptedException {
	    Elements.click(e2eHiringProfilePage.clickOnDropDown);
	    Thread.sleep(2000);
	    Elements.click(e2eHiringProfilePage.animation);
	    Thread.sleep(2000);
	}
	@Then("user clicks on Academic Completion Year")
	public void user_clicks_on_academic_completion_year() throws InterruptedException {
	   Elements.click(e2eHiringProfilePage.selectYear);
	   Thread.sleep(2000);
	}
	
	@Then("user selects {int}")
	public void user_selects(Integer int1) throws InterruptedException {
	   Elements.click(e2eHiringProfilePage.year);
	   Thread.sleep(2000);
	}
	@Then("user clicks on Candidate Type as Fresher")
	public void user_clicks_on_candidate_type_as_fresher() throws InterruptedException {
	if(!Elements.isSelected(e2eHiringProfilePage.fresher))
	   Elements.click(e2eHiringProfilePage.fresher);
	   Thread.sleep(2000);
}
	@Then("user enters current city {string}")
	public void user_enters_current_city(String string) throws InterruptedException {
	
	 Thread.sleep(2000);
	 Elements.click(e2eHiringProfilePage.enterCity);
	 Thread.sleep(2000);	
	 Elements.TypeText(e2eHiringProfilePage.enterCity, string);
	 Thread.sleep(2000);
	 Waits.tryJavascript("window.scrollBy(0,500)");
	 Thread.sleep(2000);
	 Elements.KeyboardEnter(e2eHiringProfilePage.enterCity);
	 Thread.sleep(2000);
	  }

	@Then("user clicks on Notice Period")
	public void user_clicks_on_notice_period() throws InterruptedException {
		Waits.tryJavascript("window.scrollBy(0,500)");
		 Thread.sleep(2000);
	   Elements.click(e2eHiringProfilePage.noticePeriod);
	   Thread.sleep(2000);
	   
	}

	@Then("selects Joining Immediatley")
	public void selects_joining_immediatley() throws InterruptedException {
		Elements.click(e2eHiringProfilePage.joiningImmediately);
		   Thread.sleep(2000);
	   
	}

	@Then("user scrolls down a little bit to see the screen properly")
	public void user_scrolls_down_a_little_bit_to_see_the_screen_properly() throws InterruptedException {
		Waits.tryJavascript("window.scrollBy(0,500)");
		 Thread.sleep(2000);
	}

	@Then("user clicks on Save button")
	public void user_clicks_on_save_button() throws InterruptedException {
		Elements.click(e2eHiringProfilePage.save);
		Thread.sleep(2000);
	}

}
