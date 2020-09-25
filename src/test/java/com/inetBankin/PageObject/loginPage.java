package com.inetBankin.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	
	private WebDriver driver;
	
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement userpassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	
	public void setUsername(String uName) {
		
		userName.sendKeys(uName);
	}
	
	public void setPassword(String userPassword) {
		
		userpassword.sendKeys(userPassword);
	}
	
	public void clickLogin() {
		
		btnLogin.click();;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
