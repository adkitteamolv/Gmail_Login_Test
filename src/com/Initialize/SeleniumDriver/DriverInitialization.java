package com.Initialize.SeleniumDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitialization {
	
	static WebDriver driver=null;
	
	public static WebDriver initializeDriver(){
		
		FileInputStream in;
		Properties prop=null;
		try {
			in = new FileInputStream("config.properties");
		    prop=new Properties();
			
			prop.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		System.setProperty(prop.getProperty("driver"), prop.getProperty("driverpath"));
		
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
		
		return driver;
	}
	

}
