package com.Initialize.SeleniumDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ReadProperties.File.ReadProperties;

public class DriverInitialization {
	
	static WebDriver driver=null;
	
	public static WebDriver initializeDriver(){
		
				
		System.setProperty(ReadProperties.read().getProperty("driver"), ReadProperties.read().getProperty("driverpath"));
		
		driver=new ChromeDriver();
		driver.get(ReadProperties.read().getProperty("url"));
		
		driver.manage().window().maximize();
		
		
		return driver;
	}
	

}
