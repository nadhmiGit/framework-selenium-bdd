package com.e2e.Tests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationOutlinePage {

	final static String USER_NAME_ID = "txtUsername";
	final static String PASSWORD_ID = "txtPassword";
	final static String BUTTON_LOGIN = "btnLogin";
	final static String Message_ID = "welcome";
	
	/* @FindBy */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.ID, using = BUTTON_LOGIN)
	public static WebElement btnLogin;
	@FindBy(how = How.ID, using = Message_ID)
	public static WebElement welcome;
	
	/* Method */
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}
	
	public void fillPassword(String pswd) {
		password.sendKeys(pswd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
}

