package com.interview.swiggy.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass  implements PConstants {
	Propertyfile putil=new Propertyfile();
	WebDriver driver;
	
	@BeforeSuite
	public void configsuite() {
		System.out.println("Connect to DB");
	}
	
	@BeforeClass
	public void configbef() throws IOException {
		String Broswer = putil.getpropety("browser");
		String URL = putil.getpropety("url");
		//System.out.println(Broswer);
	//	System.out.println(URL);
		
		if(Broswer.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}else if(Broswer.equals("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void beforeMethodConfig() {
		System.out.println("Login");
	}
	
	@Test
	public void test() {
		System.out.println("test 1");
	}
	
	@AfterMethod
	public void afterMethodConfig() {
		System.out.println("Logout");
	}
	
	@AfterClass
	public void afterClasConfig() {
		driver.quit();
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Close DB");
	}

}
