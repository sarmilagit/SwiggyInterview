package com.interview.swiggy.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	public String getpropety(String key) throws IOException {
	
	FileInputStream fis=new FileInputStream("C:\\Users\\mullasal\\Desktop\\Newworkspace\\com.interview.swiggy\\config.properties");
	Properties prop=new Properties();
	prop.load(fis);
	 return prop.getProperty(key);
	
	
	}
}
