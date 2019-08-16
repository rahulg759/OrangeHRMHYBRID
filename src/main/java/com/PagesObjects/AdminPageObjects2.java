package com.PagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.PagesProperties.AdminPageProperties;
import com.WrapperClass.WrapperMethods;

public class AdminPageObjects2 extends WrapperMethods{
	
 public	AdminPageObjects2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using=AdminPageProperties.admin_Link_Xpath)
	WebElement wbAdminLink;
	
	@FindBy(how=How.XPATH,using=AdminPageProperties.userName_Xpath)
	WebElement wbUesrName;
	
	@FindBy(how=How.XPATH,using=AdminPageProperties.userRole_Xpath)
	WebElement wbUserRole;
	
	@FindBy(how=How.XPATH,using=AdminPageProperties.employeeName_Xpath)
	WebElement wbEmployeeName;
	
	@FindBy(how=How.XPATH,using=AdminPageProperties.userStatus_Xpath)
	WebElement wbStatus;
	
	@FindBy(how=How.XPATH,using=AdminPageProperties.searchBtn_Xpath)
	WebElement wbSearchBtn;
	
	@FindBy(how=How.XPATH,using=AdminPageProperties.resetBtn_Xpath)
	WebElement wbResetBtn;
	
	
	public AdminPageObjects2 clickOnAdminLink()
	{
	click(wbAdminLink);
	return this;
	}
	
	public AdminPageObjects2 enterUsername(String data)
	{
		enterData(wbUesrName, data);
		return this;
	}
	public AdminPageObjects2 selectUserRole(String data)
	{
		enterText(wbUserRole, data);
		return this;
	}
	
	public AdminPageObjects2 enterEmployeeName(String data)
	{
		enterData(wbEmployeeName, data);
		return this;
	}
	
	public AdminPageObjects2 selectstatus(String data)
	{
		enterText(wbStatus, data);
		return this;
	}
	
	public AdminPageObjects2 clickOnSearchBtn()
	{
	click(wbSearchBtn);
	return this;
	}
	

}
