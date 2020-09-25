package com.inetBankin.TestCases;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {

	public String baseUrl="http://demo.guru99.com/v3/index.php";
	public String uName="mngr247649";
	public String userPassword="EnUqaza";
	public static WebDriver driver;
	
	
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger = Logger.getLogger("eBanking");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
