package com.automation.stepdef;


import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.ScenarioAPage;

import io.cucumber.java.en.*;


public class ScenarioA extends Base {
	
	ScenarioAPage scenA = new ScenarioAPage();
	
	@Given("^user launches the application$")
	public void user_launches_the_application() throws InterruptedException{
		
		Base.driver.get(Base.reader.getUrl());
		System.out.println("Launch the application");
		Thread.sleep(5000);
		
	}
	
	@When("user enter username {string}")
	public void user_enter_username(String string) {
	   Elements.TypeText(ScenarioAPage.username, string);
	}
	
	@Then("user enters password {string}")
	public void user_enters_password(String string) {
	    Elements.TypeText(ScenarioAPage.password, string);
	}
	@Then("user clicks on login button.")
	public void user_clicks_on_login_button() {
		Elements.click(ScenarioAPage.loginButton);
	   
	}

	
	
	
}
