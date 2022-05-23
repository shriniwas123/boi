package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.qa.pagelayer.HomePage;
import com.qa.utility.CommonMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	public static WebDriver driver;
    public HomePage home;
    public CommonMethods utility;
	
	@BeforeMethod
	public void webDriverSetup() {
		String Broweser = "chrome";
		if (Broweser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Broweser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoblaze.com/index.html");
		home= new HomePage();
		utility= new CommonMethods();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}