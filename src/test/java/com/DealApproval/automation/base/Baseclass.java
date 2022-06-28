package com.DealApproval.automation.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.DealApproval.automation.core.WebDriverFactory;
import com.DealApproval.automation.pageobjects.Comman_ObjectPage;
import com.DealApproval.automation.pageobjects.Login_Page_MGM;
import com.DealApproval.automation.stepdefs.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Baseclass {
	
    private static final Logger logger = LogManager.getLogger(StepDefs.class);

	
	 WebDriver driver;
	 String base_url = "https://mgmstudios--uat.lightning.force.com/c/optmNewOppAppA.app";
	 int implicit_wait_timeout_in_sec = 20;
	 Scenario scn;
	 
	 Login_Page_MGM loginpagemgm;
	 Comman_ObjectPage comnobjectpage;
	 

	 @Before
	    public void setUp(Scenario scn) throws Exception {
	        this.scn = scn; //Assign this to class variable, so that it can be used in all the step def methods

	        //Get the browser name by default it is chrome
	        String browserName = WebDriverFactory.getBrowserName();
	        driver = WebDriverFactory.getWebDriverForBrowser(browserName);
	        logger.info("Browser invoked.");
	        
	        
	        //Init Page Object Model Objects
	        loginpagemgm = new Login_Page_MGM(driver);
	        comnobjectpage = new Comman_ObjectPage(driver);

	        
	        WebDriverFactory.navigateToTheUrl(base_url);
	        scn.log("Browser navigated to URL: " + base_url);

	                
	        String expected = "MGM Opportunity Management";
	        comnobjectpage.validatePageTitleMatch(expected);
	     
	        
	        String sdfsf = "{\n" +
	                "  \"content\": [\n" +
	                "    {\n" +
	                "      \"fullName\": \"string\",\n" +
	                "      \"userName\": \"string\"\n" +
	                "    }\n" +
	                "  ],";
	    }

	    
	    @After(order=1)
	    public void cleanUp(){
	        //WebDriverFactory.quitDriver();
	        scn.log("Browser Closed");
	    }

	    @After(order=2)
	    public void takeScreenShot(Scenario s) {
	        if (s.isFailed()) {
	            TakesScreenshot scrnShot = (TakesScreenshot)driver;
	            byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
	            scn.attach(data, "image/png","Failed Step Name: " + s.getName());
	        }else{
	            scn.log("Test case is passed, no screen shot captured");
	        }
	    }

	  
}





