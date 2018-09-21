package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pages.Loginpage;
import com.repository.InitiateDriver;

public class SetOneTests extends InitiateDriver {

	
	
	
	
	WebDriver driver=InitiateDriver.driver;
	@Test
	public void Testcase1() {
		InitiateDriver.launchChrome();
		Loginpage lg = new Loginpage(driver);
		
		lg.loginto_Dashboard("soteraprm@honeywell.com", "#S0teraPrmr0cks");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
}
