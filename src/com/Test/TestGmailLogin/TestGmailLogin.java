package com.Test.TestGmailLogin;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.GmailLoginElements.TestFunctions.GmailLoginTestFunctions;
import com.Initialize.SeleniumDriver.DriverInitialization;

public class TestGmailLogin {
	
	WebDriver driver=null;
	public GmailLoginTestFunctions gmailObject;
		
	  @BeforeTest
	  public void initDriver()
	  {
		
		  driver=DriverInitialization.initializeDriver();
		  gmailObject=new GmailLoginTestFunctions(driver);
	  }
	  
	  @BeforeMethod
	  public void clearTextBox(){
		  
		  gmailObject.clearAll();
		  
		  System.out.println("Before Method");
	  }
	  
	  
	  @Test(priority=0)
	  
	  public void testLandingPage(){
		  
		  Boolean gmailsigninButton = gmailObject.signInButton();
		  Boolean gmailcreateAccount= gmailObject.createAccountLink();
		  
		  if(gmailsigninButton.equals(true) && gmailcreateAccount.equals(true)){
			  
			  System.out.println("SignIn Button Present" + gmailsigninButton);
			  
			  System.out.println("Create Account Link Present" + gmailcreateAccount);	
		  }
		  
		  else{
			  
			  System.out.println("Not landed on correcr Page");
			  driver.quit();
		  }
		  	  
			  
	  }
	  
	 
	@Test(priority=1)
	  public void enterNullInputs() 
	  {
		   
		   gmailObject.enterLoginDetails("", "");
		  
		   gmailObject.clickonSignInButton();
		   
		   String ActualerrorMessage= gmailObject.getEmailErrorMessage();
		   
		   Assert.assertEquals(ActualerrorMessage, "Enter your email address");
		  	   
		}
	  
	    @Test(priority=2)
	    public void enterUserNameOnly()
	    {
	    	   gmailObject.enterLoginDetails("adkitteamolv", "");
			  
			   gmailObject.clickonSignInButton();
			   
			   String ActualerrorMessage= gmailObject.getPasswordErrorMessage();
			   
			   Assert.assertEquals(ActualerrorMessage, "Enter your password.");
		  
	    }
	  
	    @Test(priority=3)
	    public void enterPasswordOnly()
	    {
	    	   gmailObject.enterLoginDetails("", "9960277546");
			  
			   gmailObject.clickonSignInButton();
			   
			   String ActualerrorMessage= gmailObject.getEmailErrorMessage();
			   
			   Assert.assertEquals(ActualerrorMessage, "Enter your email address.");
		  
	    }
	  
	    @Test(priority=4)
	    public void enterIncorrectUserNamePassword()
	    {
	    	   gmailObject.enterLoginDetails("abcd", "abcd");
			  
			   gmailObject.clickonSignInButton();
			   
			   String ActualerrorMessage= gmailObject.getPasswordErrorMessage();
			   
			   Assert.assertEquals(ActualerrorMessage, "The email or password you entered is incorrect. ?");
		  
	    }
	    
	    @Test(priority=5)
	    public void enterCorrectUserNamePassword()
	    {
	    	   gmailObject.enterLoginDetails("adkitteamolv", "9960277546");
			  
			   gmailObject.clickonSignInButton();
			   
			   String ActualerrorMessage= gmailObject.getPageTitle();
			   
			   System.out.println(ActualerrorMessage);
			   
			   Assert.assertEquals(ActualerrorMessage, "Gmail");
		  
	    }
	    
	 
	  
	  @AfterTest
	  public void quitDriver(){
		  
		  driver.quit();
	  }
	  
	  
}
