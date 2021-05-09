package com.zohocrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zohocrm.baseclass.Testbase;
import com.zohocrm.util.Testutil;
import com.zohocrmautomation.Home;
import com.zohocrmautomation.Leads;
import com.zohocrmautomation.Loginpage;

public class leadstest extends Testbase {
	Loginpage login ;
	Home home;
	Leads leads;
	Testutil util;
	String sheetname = "leadsdds";

	public leadstest() throws Exception {
		super();

	}
	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		leads = new Leads();
		util= new Testutil();
		login= new Loginpage();
		home=login.login(prop.getProperty("name"), prop.getProperty("password"));
		home.clickonleads();
		
	}
	
	@Test(priority=1)
	public void creatingleadstest(){
		leads.clickingonnewleads();
	}
	//@Test (priority=2)
	//public void leadsdisplaytest(){
	////Assert.assertTrue(leads.leadsdisplay(),"leads lable is missing on page");
	//}
	
	@DataProvider
	public Object[][] gettestdata(){
	Object[][] data =  util.getTestData(sheetname);
	return data;
		
	}
	
	@Test (priority=3,dataProvider="gettestdata")
	public void createleadtest(String title, String companyname, String lastname ){
		leads.creatingleads(title,companyname,lastname);
	}
	
	
	
	//@AfterMethod
	//public void teardown(){
		//driver.quit();
		
//	}

}
