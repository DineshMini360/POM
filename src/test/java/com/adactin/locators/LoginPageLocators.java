package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.utils.BaseClass;

public class LoginPageLocators extends BaseClass{
	public LoginPageLocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement user;
	
	@FindBy(xpath = "//*[@type='password']")
	private WebElement pass;
	
	@FindAll({@FindBy(xpath = "//*[contains(@type, 'Submit')]"),@FindBy(xpath = "(//*[contains(@id, 'login')])[2]")})
	private WebElement login;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
}
