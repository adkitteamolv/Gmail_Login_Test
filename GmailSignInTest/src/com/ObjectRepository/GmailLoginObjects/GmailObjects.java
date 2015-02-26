package com.ObjectRepository.GmailLoginObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailObjects {
	
WebDriver driver=null;
	
	By email=By.id("Email");
	By password=By.id("Passwd");
	By signIn=By.id("signIn");
	
	By errorEmail=By.id("errormsg_0_Email");
	By errorPassword=By.id("errormsg_0_Passwd");
	
	
	// Class Constructor
	public GmailObjects(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	//Page Objects
	public WebElement emailTextBox(WebDriver driver) {
		
		return driver.findElement(email);
			
	}
	
	public WebElement passwordTextBox(WebDriver driver) {
		
		return driver.findElement(password);
	}
	
	public WebElement signInButton(WebDriver driver) {
		
		return driver.findElement(signIn);
	}
	
	
	public WebElement errorEmailLabel(WebDriver driver) {
		
		return driver.findElement(errorEmail);
	}
	
	public WebElement errorPasswordLabel(WebDriver driver) {
		
		return driver.findElement(errorPassword);
	}
	
	
}
