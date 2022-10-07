package org.stedefinitions;

import org.libglobal.BaseClass;
import org.pom.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookStepFile extends BaseClass{
	LoginPojo f;
	@Given("To lauch the chromeBrowser and hit the facebook url")
	public void to_lauch_the_chromeBrowser_and_hit_the_facebook_url() {
	   LaunchBrowser();
	   LaunchUrl("https://en-gb.facebook.com/");
	   
	}

	@When("To pass the invalid credentials to username field")
	public void to_pass_the_invalid_credentials_to_username_field() {
	    f=new LoginPojo();
	    sendValue(f.getUserName(),"gnanasandhyaece@gmail.com");
	    
	    
	}

	@When("To pass the invalid credentials to password field")
	public void to_pass_the_invalid_credentials_to_password_field() {
		
		
		 f=new LoginPojo();
		    sendValue(f.getPass(),"sandhya");
		      
	}

	@When("To click the login button")
	public void to_click_the_login_button() throws InterruptedException {
		 f=new LoginPojo();
		    buttonclk(f.getLoginButton());
		    Thread.sleep(3000);
		    
		    
	}

	@Then("To click the chrome browser")
	public void to_click_the_chrome_browser() {
		driver.close();	   
	  
	}

	
	

}
