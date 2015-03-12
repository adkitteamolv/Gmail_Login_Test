package com.ReadProperties.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	static FileInputStream in;
	
	static Properties prop=null;
	
	public static Properties read(){
		
		try {
			in= new FileInputStream("config.properties");
			
			prop=new Properties();
			
			prop.load(in);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
	}

}
