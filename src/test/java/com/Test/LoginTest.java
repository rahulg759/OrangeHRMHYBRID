package com.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PagesObjects.LoginPageObjects;
import com.Utilities.TestData;
import com.WrapperClass.WrapperMethods;

public class LoginTest extends WrapperMethods {

	/*
	@DataProvider(name="LoginTestData")
	public Object[][] getTestData()
	{
		Object data[][]=TestData.getTestData("Sheet1");
		return data;
		
	}*/
	
	

	
	@Test/*(dataProvider="LoginTestData")*/
	public void verifyLoginFunctionalities(/*String uname,String pass*/)
	{
	initializedriver();
	new LoginPageObjects(driver)
	.enterUser("Admin")
	.enterPassword("admin123")
	.clickOnSubmitButton();
	
	//return this;
	
	
	
		
		
	}

}
