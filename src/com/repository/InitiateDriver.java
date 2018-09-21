package com.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitiateDriver {
	public static WebDriver driver;
	
	
	
	
	
	
	
	public static void launchChrome(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://sotera-crm-dev.honeywell.com");
		
	}
	
	
	
}
