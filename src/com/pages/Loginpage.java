package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.repository.InitiateDriver;

public class Loginpage extends InitiateDriver{
	
		private WebElement email;
		
		
		private WebElement password;
		private WebElement submit_button;
	
		public Loginpage(WebDriver driver) {	
			
			email=driver.findElement(By.cssSelector("input#email"));
			password=driver.findElement(By.cssSelector("input#password"));
			submit_button=driver.findElement(By.cssSelector("input#submit_btn"));
			
		}
		
		public void loginto_Dashboard(String email,String password) {
			this.email.sendKeys(email);
			this.password.sendKeys(password);
			submit_button.click();
			
		}
	}