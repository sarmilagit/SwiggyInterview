package com.interview.swiggy.testcases;

import static org.testng.Assert.fail;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.interview.swiggy.generic.BaseClass;
import com.interview.swiggy.pom.LoginPagePOM;
@Listeners()
public class Sample1 extends BaseClass{
	
	SoftAssert ass=new SoftAssert();
	
	@Test
	public void main() {
		LoginPagePOM l= new LoginPagePOM(driver);
		boolean swiggy__img = l.getSwiggyLogo().isDisplayed();
		if(swiggy__img) {
			System.out.println("Pass");
		}else {
			ass.fail();
			ass.assertAll();
		}	
		if(!l.getLocate_me().isDisplayed()) {
			ass.fail();
		}
		l.getLocate_me().click();
	}
	
	
	
}
