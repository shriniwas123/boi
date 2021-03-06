package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pagelayer.FbLogin;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbTestBase {
	
		public static FbLogin F;
		
		public static WebDriver driver;
		
		@BeforeMethod
		public void launchbrowser()
		{
			WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.facebook.com/");

		F= new FbLogin();
		
		}
		@AfterMethod
		public void TearDown()
		{
			driver.quit();
		}

	

}
