package com.DealApproval.automation.runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)

@CucumberOptions(
        features="src/test/resources/features",//to tell cucumber where is ur feature file
        glue="com.DealApproval.automation.stepdefs", // to tell cucumber where is ur step def code
        tags="@Loginsalesforce", // to tell which tagged feature file to execute
        plugin = {"pretty", // to generate reports
            "html:target/html/htmlreport.html",
            "json:target/json/file.json",
            },
        monochrome= true,
        publish=true,
        dryRun=false // to tell whether to test run(true) or actual run(false)
        )

public class runner extends AbstractTestNGCucumberTests{
	private TestNGCucumberRunner tcr;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception
	{
//		tcr = new TestNGCucumberRunner(this.getClass());
	}
	
//	 @Test(groups="cucumber", description="Runs CucumberFeature", dataProvider="features")
//	public void feature(CucumberFeature cucumberFeature)
//	{
//		 tcr.runCucumber(cucumberFeature.getCucumberFeature());
//   }
	
//	@DataProvider
//	public Object[][] features()
//	{
//		return tcr.provideFeatures();
//	}
	
	@AfterClass(alwaysRun = true)
		public void tearDownClass()
	{
//		tcr.finish();
	}
}
