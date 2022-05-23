package newProjects;

//import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	/*	driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Save= new File("C:\\Users\\shriniwas shete\\Desktop\\boi\\MySeleniumFinal\\ScreenShots\\2.png");
		FileHandler.copy(src, Save);
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		 File src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File  Save2= new File("C:\\Users\\shriniwas shete\\Desktop\\boi\\MySeleniumFinal\\ScreenShots\\3.png");
		FileHandler.copy(src2, Save2);
		//driver.quit();
		driver.get("https://www.flipkart.com/");
		File src3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File X=new File("C:\\Users\\shriniwas shete\\Desktop\\boi\\MySeleniumFinal\\ScreenShots\\4.png");
		FileHandler.copy(src3, X);
		System.out.println(driver .getCurrentUrl());
		driver.quit();*/
		driver.get("https://www.youtube.com/watch?v=oGUNA9B3_6E");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		driver.findElement(By.ByClassName.className("ytp-large-play-button ytp-button")).click();
		Thread.sleep(20000);
		driver.findElement(By.ByClassName.className("ytp-large-play-button ytp-button")).click();
		
		
	}

}
