package com.qa.pagelayer;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public HomePage h;
	public static WebDriver Driver;
@Test
	@BeforeMethod
	public void webDriverSetup() {
		String br = "Edge";
		if (br.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			Driver = new ChromeDriver();
		} else if (br.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			Driver = new FirefoxDriver();
		} else if (br.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			Driver = new EdgeDriver();
		} else {
			System.out.println("Enter valid broweser");
		}
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get("https://demoblaze.com/index.html");
		h = new HomePage();

	}
	@Test

	@AfterMethod
	public void tearDown() {
		Driver.quit();
	}

}
