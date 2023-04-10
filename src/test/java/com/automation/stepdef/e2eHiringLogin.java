package com.automation.stepdef;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.e2eHiringLoginPage;

import io.cucumber.java.en.*;

public class e2eHiringLogin extends Base {
	
	e2eHiringLoginPage login = new e2eHiringLoginPage();
	
	@Given("^user launches the application$")
	public void user_launches_the_application() throws InterruptedException{
		
		Base.driver.get(Base.reader.getUrl());
		System.out.println("Launch the application");
		Thread.sleep(5000);
		
	}
	
	@When("user enter username {string}")
	public void user_enter_username(String string) throws InterruptedException {
	   Elements.TypeText(e2eHiringLoginPage.username, string);
	   Thread.sleep(2000);
	}
	
	@Then("user enters password {string}")
	public void user_enters_password(String string) throws InterruptedException {
	    Elements.TypeText(e2eHiringLoginPage.password, string);
	    Thread.sleep(2000);
	}
	@Then("user clicks on login button.")
	public void user_clicks_on_login_button() throws InterruptedException {
		Elements.click(e2eHiringLoginPage.loginButton);
		Thread.sleep(2000);
	}


	
}
