package com.PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.PagesProperties.LoginPageProperties;
import com.WrapperClass.WrapperMethods;

public class LoginPageObjects extends WrapperMethods {

	public LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = LoginPageProperties.username_Xpath)
	WebElement wbUserName;

	@FindBy(how = How.XPATH, using = LoginPageProperties.password_Xpath)
	WebElement wbPassword;
	@FindBy(how = How.XPATH, using = LoginPageProperties.submitButton_Xpath)
	WebElement wbSubmitButton;

	public LoginPageObjects enterUser(String data) {

		enterData(wbUserName, data);
		return this;
	}

	public LoginPageObjects enterPassword(String data) {

		enterData(wbPassword, data);
		return this;
	}

	public LoginPageObjects clickOnSubmitButton() {
	
		click(wbSubmitButton);
		return this;
	}

}
