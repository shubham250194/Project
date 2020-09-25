package com.inetBankin.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankin.PageObject.loginPage;


public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
		
		loginPage lp = new loginPage(driver);
		
		lp.setUsername(uName);
		lp.setPassword(userPassword);
		lp.clickLogin();
		
		logger.info("login successful");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
