package com.Initialize.SeleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitialization {
	
	static WebDriver driver=null;
	
	public static WebDriver initializeDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&ss=1&ltmpl=default&rm=false");
		
		driver.manage().window().maximize();
		
		
		return driver;
	}
	

}
