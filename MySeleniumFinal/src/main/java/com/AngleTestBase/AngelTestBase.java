package com.AngleTestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AngelTestBase {
	public static WebDriver driver;
@BeforeMethod
public void launchBroweser(){
WebDriverManager.chromedriver().setup();
driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://trade.angelbroking.com/Login");

}

@AfterMethod
public void closeBroweser() {
	//driver.quit();
}
}