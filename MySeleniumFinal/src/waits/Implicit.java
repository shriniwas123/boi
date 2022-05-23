package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//d.manage().window().minimize();//3.159 made nahi yet
		driver.manage().deleteAllCookies();
//	d.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS); // 3.159.
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// 4.1.2 version
		driver.get("https://www.facebook.com/");
		
		
		WebDriverWait ww= new WebDriverWait(driver, Duration.ofSeconds(10));
	
		WebElement drag= driver.findElement(By.xpath("//input[@id='email']"));
		//WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
		drag.sendKeys("7798900745");
		ww.until(ExpectedConditions.visibilityOf(drag));
	
		WebElement drag1= driver.findElement(By.xpath("//input[@id='pass']"));
		drag1.sendKeys("hdsdj");
		ww.until(ExpectedConditions.visibilityOf(drag1));
		driver.quit();
	}

}
