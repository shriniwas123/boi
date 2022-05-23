package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTubeIframes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder (2)\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=wp3kcWOda6k");
		//driver.switchTo().frame("player");
		Thread.sleep(3000);
		//button[@class='ytp-large-play-button ytp-button']
		driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
		//div[@class='ytp-volume-panel']
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[@class='ytp-mute-button ytp-button']")).click();
		driver.switchTo().frame(0);
		
WebElement w= 	driver.findElement(By.xpath("//div[@class='ytp-volume-slider']']"));

	Actions A = new Actions(driver);
	A.moveToElement(w).perform();
	A.dragAndDropBy(w, 200, 0).perform();
	//A.moveToElement(w, 100, 200).perform()
//	A.contextClick(w);
	
	
//	A.dragAndDropBy(w, 500, 0);
	}

}
