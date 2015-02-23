package com.GmailLoginElements.TestFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ObjectRepository.GmailLoginObjects.GmailObjects;

public class GmailLoginTestFunctions {
	
			
	WebDriver driver=null;
	
	GmailObjects object = new GmailObjects(driver);
	
	//Class Constructor
	public GmailLoginTestFunctions(WebDriver driver){
		
		this.driver=driver;
	}
	
	public void enterLoginDetails(String email,String password){
		
		object.emailTextBox(driver).sendKeys(email);
		object.passwordTextBox(driver).sendKeys(password);
	}
	
	public void clickonSignInButton() {
		object.signInButton(driver).click();
		
	}
	
	public String getEmailErrorMessage(){
		
		return object.errorEmailLabel(driver).getText();
		
	}
	
	public String getPasswordErrorMessage(){
		
		return object.errorPasswordLabel(driver).getText();
		
	}
	
	public String getPageTitle() {
		
		return driver.getTitle();
	}
	
	public void clearAll(){
		object.emailTextBox(driver).clear();
		object.passwordTextBox(driver).clear();
		
	}

	

}
