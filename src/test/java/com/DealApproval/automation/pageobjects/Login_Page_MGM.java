package com.DealApproval.automation.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page_MGM {

	private static final Logger logger = LogManager.getLogger(Login_Page_MGM.class);
	WebDriver driver;

	/*Locators*/
	public static By userid = By.id("username");
	public static By passw = By.id("password");
	public static By loginbutton = By.id("Login");

	
	
	public Login_Page_MGM(WebDriver driver) {
		this.driver = driver;
	}
}
