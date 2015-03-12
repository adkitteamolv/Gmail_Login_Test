package com.GmailLoginElements.TestFunctions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.ObjectRepository.GmailLoginObjects.GmailObjects;
import com.ReadProperties.File.ReadProperties;

public class GmailLoginTestFunctions {
	
			
	static WebDriver driver=null;
	
	static int i=0;
	
	GmailObjects object = new GmailObjects(driver);
	
	//Class Constructor
	public GmailLoginTestFunctions(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	// Test Functions
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
	
	public Boolean signInButton(){
		
		return object.signInButton(driver).isDisplayed();
	
	}
	
	public Boolean createAccountLink(){
		
		return object.createAccountLink(driver).isDisplayed();
	
	}
	
	public static void pagescreenshot(){
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String name="Gmail_Login"+i;
		
		
		try {
			FileUtils.copyFile(screenshot, new File(ReadProperties.read().getProperty("screenshot_path")+"\\"+name+".jpeg"));
			i++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	

}
