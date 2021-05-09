package com.zohocrm.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.zohocrm.util.Testutil;

public class Testbase {
	
	public static WebDriver driver;
	 public static Properties prop;
	
	public Testbase() throws Exception{
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\win10\\workspace\\pomzoho\\src\\main\\java\\com\\zohocrm\\cofig\\config.properties");
		prop.load(ip);                            
		
	}
	
	public static void initialization(){
		String browsername = prop.getProperty("browser");
		if(browsername.equals("crome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\workspace\\pomzoho\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		 
	}
	
	

}
