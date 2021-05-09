package com.zohocrmautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohocrm.baseclass.Testbase;

public class Leads extends Testbase {
	
	public Leads() throws Exception {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//*[@id='table_row_1']/lyte-td[3]/span[1]/link-to/button")
	WebElement leadscreatingbutton;
	
	@FindBy(xpath ="//*[@id='Crm_Leads_COMPANY']")
	WebElement title;
	
	@FindBy(xpath ="//*[@id='Crm_Leads_COMPANY']")
	WebElement companyname;
	
	@FindBy(xpath ="//*[@id='Crm_Leads_LASTNAME']")
	WebElement lastname;
	
	@FindBy(xpath ="//*[@id='saveLeadsBtn']")
	WebElement save;
	
	@FindBy(xpath="//*[@id='86265000000000871']/lyte-text")
	WebElement leadsdisplay;
	
	
	@FindBy(xpath="//*[@id='mainMenuTabDiv']/crm-menu/div[1]/crm-tab/div[2]/div[2]/a")
	WebElement leadsbuttonn;
	

	
	public void clickingonnewleads(){
		leadscreatingbutton.click();
	}
	
	public boolean leadsdisplay(){
		return leadsdisplay.isDisplayed();
	}
	
	public void creatingleads(String title1, String companyname1, String lastname1){
		leadscreatingbutton.click();
		title.sendKeys(title1);
		companyname.sendKeys(companyname1);
		lastname.sendKeys(lastname1);
		save.click();
		
	}
	
}
