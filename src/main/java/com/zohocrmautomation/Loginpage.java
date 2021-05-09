package com.zohocrmautomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohocrm.baseclass.Testbase;

public class Loginpage extends Testbase{

	//pagrfactotr , object repository ,page objects

	@FindBy(xpath ="//*[@id='block-system-main']/div/div[2]/div[4]/p/a")
	WebElement sighin;

	@FindBy(xpath ="//*[@id='block-system-main']/div/div/div[1]/span/a")
	WebElement login;

	@FindBy(xpath ="//*[@id='login_id']")
	WebElement name;

	@FindBy(xpath ="//*[@id='nextbtn']")
	WebElement next;

	@FindBy(xpath ="//*[@id='password']")
	WebElement password;

	@FindBy(xpath ="//*[@id='nextbtn']")
	WebElement passnext;
	
	@FindBy(xpath ="//img[contains(@class,zoho_logo)]")
	WebElement logo;
	
	//initializing page objects 
	public Loginpage() throws Exception {
       PageFactory.initElements(driver, this);
	}
	
	//actions 
	public String  verifypagetitle(){
		return driver.getTitle();
	}
	
	public void verifyimage(){
		logo.isDisplayed();
	}
	
	public Home login(String unn, String pass) throws Exception{
		sighin.click();
		login.click();
		name.sendKeys(unn);
		next.click();
		password.sendKeys(pass);
		passnext.click();
		return  new Home();
		
	}
	
	
	


	

	}
