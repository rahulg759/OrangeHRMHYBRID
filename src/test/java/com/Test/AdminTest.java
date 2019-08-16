package com.Test;

import org.testng.annotations.Test;

import com.PagesObjects.AdminPageObjects;
import com.WrapperClass.WrapperMethods;

public class AdminTest extends WrapperMethods {
	
	
	
	@Test
	public void verifyAdminPageElements()
	{
		new LoginTest()
		.verifyLoginFunctionalities();
		
		new AdminPageObjects(driver)
		.clickOnAdminLink()
		.enterUsername("narendra")
		.selectUserRole("Admin")
		.enterEmployeeName("raju")
		.selectstatus("Enabled")
		.clickOnSearchBtn();
		
        		
		
		
	}

}
