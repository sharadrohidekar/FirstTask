package com.automation.stepdef;

import java.util.ArrayList;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.framework.Waits;
import com.automation.pages.ScenarioA2Page;


import io.cucumber.java.en.Then;

public class ScenarioA2 extends Base {
	
	ScenarioA2Page scenA = new ScenarioA2Page();
	
	@Then("click on mentorship button.")
	public void click_on_mentorship_button() throws InterruptedException {
	   Elements.click(ScenarioA2Page.mentorship);
	   Thread.sleep(2000);
	}

	@Then("click on overview button")
	public void click_on_overview_button() throws InterruptedException {
	   Elements.click(ScenarioA2Page.overview);
	   Thread.sleep(2000);
	}
	@Then("scroll down to Registration for Orientation")
	public void scroll_down_to_registration_for_orientation() throws InterruptedException {
		Waits.tryJavascript("window.scrollBy(0,1500)");
	   Thread.sleep(2000);
	}
	@Then("click on Registration for Orientation")
	public void click_on_registration_for_orientation() throws InterruptedException {
	   Elements.click(ScenarioA2Page.registration);
	   Thread.sleep(2000);
	   ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(tabs.get(1));
	}



}
