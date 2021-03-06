package com.qa.TestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import com.qa.pagelayer.HomePage;
import com.qa.pagelayer.LoginPage;
import com.qa.utility.CommonMethods;
import com.qa.utility.TeastData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	  public Logger logger;
	public static WebDriver driver;
    public HomePage home;
    public CommonMethods utility;
    public LoginPage login;
    public TeastData test;
    
    @BeforeClass
	public void start()
	{
		logger = Logger.getLogger("DemoBlaze demo framework xyz");
		PropertyConfigurator.configure("log4j.properties");
	}
	@AfterClass
	public void stop()
	{
	}
	
  
	
	@BeforeMethod
	public void webDriverSetup() {
		String Broweser = "chrome";
		if (Broweser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Broweser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			logger.info("chrome launch");
			
			
		}
		driver.manage().window().maximize();
		logger.info("maximise");
		
		driver.manage().deleteAllCookies();
		logger.info("delete all cookies");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoblaze.com/index.html");
		logger.info("url  launch");
		
		home= new HomePage();
		utility= new CommonMethods();
		login= new LoginPage();
		test =new TeastData();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		logger.info("browser close");
	}

}