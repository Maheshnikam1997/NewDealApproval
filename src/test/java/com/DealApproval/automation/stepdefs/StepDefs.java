package com.DealApproval.automation.stepdefs;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DealApproval.automation.base.Baseclass;

public class StepDefs {

   
    private static final Logger logger = LogManager.getLogger(StepDefs.class);
    
    Scenario scn;
    
    Baseclass baseclass;
    
        	
	       
    @Given("User navigated to the dealapproval application url")
    public void user_navigated_to_the_dealapproval_application_url() 
    {
    	throw new io.cucumber.java.PendingException();
    }
    
    @When("user_login username {string} and password {string}")
    public void user_login_username_and_password(String string, String string2)
    {
    	throw new io.cucumber.java.PendingException();
    }
    
    @Then("User successfully login on opportunity information dashboard.")
    public void user_successfully_login_on_opportunity_information_dashboard()
    {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

