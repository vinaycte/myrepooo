package com.zohocrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohocrm.baseclass.Testbase;
import com.zohocrmautomation.Home;
import com.zohocrmautomation.Loginpage;

public class Homepagetest extends Testbase {
	Loginpage login ;
	Home home;
	
	
	
	public Homepagetest() throws Exception {//first comes to constructor and properties will be initilizes 
		super();
		
	}
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		login= new Loginpage();
		home=login.login(prop.getProperty("name"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifytitletest(){
	String homepagetitle 	= home.verifypagetitle();
     Assert.assertEquals(homepagetitle, "Zoho Accounts");
	}
	
	@Test (priority=2)
	public void clickonleadslinktest() throws Exception{
		home.clickonleads();
	}
	
	
	@AfterMethod
	public void teardown1(){
		driver.quit();
		
	}
	
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}
	

}
