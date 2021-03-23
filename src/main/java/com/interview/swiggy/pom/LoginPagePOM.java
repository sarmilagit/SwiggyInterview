package com.interview.swiggy.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interview.swiggy.generic.BaseClass;

public class LoginPagePOM extends BaseClass {
	
	public LoginPagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Locate Me']")
	private WebElement Locate_me;
	
	@FindBy(xpath="//*[name()='path']")
	private WebElement SwiggyLogo;
	
	
	public WebElement getSwiggyLogo() {
		return SwiggyLogo;
	}
  
	public WebElement getLocate_me() {
		return Locate_me;
	}

	
	
	
}
