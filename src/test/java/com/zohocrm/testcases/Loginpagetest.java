package com.zohocrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohocrm.baseclass.Testbase;
import com.zohocrmautomation.Home;
import com.zohocrmautomation.Loginpage;

public class Loginpagetest extends Testbase {
	Loginpage login;
	Home home ;
	public Loginpagetest() throws Exception {
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		 login = new Loginpage();
	}

	@Test(priority=1)
	public void verifyingtitletest(){
		 String Title = login.verifypagetitle();
		 Assert.assertEquals(Title, "Sign in to Zoho CRM | Zoho CRM Login");
	}
	
	@Test(priority=2)
	public void logintest() throws Exception{
		home =	login.login(prop.getProperty("name"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}
}
