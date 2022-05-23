package iFrames;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.Timeout;

public class FrameHandling {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://chercher.tech//practice//frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("Rohan Sanghai");
		Thread.sleep(3000);
	
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement web= driver.findElement(By.xpath("//select[@id='animals']"));
		Select s= new Select(web);
		s.selectByVisibleText("Avatar");
		Thread.sleep(3000);
		driver.quit();
		

		
	}

}
