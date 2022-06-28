package com.DealApproval.automation.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Comman_ObjectPage {

	private static final Logger logger = LogManager.getLogger(Comman_ObjectPage.class);
	WebDriver driver;
	
	
	
	public Comman_ObjectPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validatePageTitleMatch(String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Boolean b = wait.until(ExpectedConditions.titleContains(expectedTitle));
		Assert.assertEquals(true, b);
		logger.info("Page title matched: " + expectedTitle );
	}

}
