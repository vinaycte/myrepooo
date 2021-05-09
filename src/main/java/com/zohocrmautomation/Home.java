package com.zohocrmautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohocrm.baseclass.Testbase;

public class Home extends Testbase	 {
	

	public Home() throws Exception {
PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//*[@id='mainMenuTabDiv']/crm-menu/div[1]/div/link-to/a/img")
	@CacheLookup
	WebElement imagecrm;
	
	@FindBy(xpath = "//*[@id='mainMenuTabDiv']/crm-menu/div[1]/crm-tab/div[2]/div[2]/a")
	@CacheLookup
	WebElement leads ;
	
	@FindBy(xpath = "//*[@id='mainMenuTabDiv']/crm-menu/div[1]/crm-tab/div[2]/div[3]")
	@CacheLookup
	WebElement contacts;
	
	
	//actions 
	public String  verifypagetitle(){
	return  driver.getTitle();
		
	}
	
	public void clickoncontactslink(){
	contacts.click();
	
	}
	public Leads clickonleads() throws Exception{
		leads.click();
		return new Leads();
	}
	
	
	
	
	}
	
	
	

