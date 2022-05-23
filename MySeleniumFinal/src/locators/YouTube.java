package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\New folder (2)\\chromedriver.exe" );
		WebDriver D=new ChromeDriver();
	D.get("https://www.youtube.com/");
		Thread.sleep(3000);
	/*	D.findElement(By.name("search_query")).sendKeys("ye jo teri paylo ki chan chan hai");
		Thread.sleep(3000);
		D.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		D.findElement(By.id("channel-info")).click();
		Thread.sleep(10000);
		D.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).click();
		Thread.sleep(50000);
		D.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
		Thread.sleep(5000);
		D.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
		//a[@title='Rahat Fateh Ali Khan - Zaroori Tha']*/
		D.findElement(By.name("search_query")).sendKeys("tera namm dokha");
		Thread.sleep(3000);
		D.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		D.findElement(By.id("channel-info")).click();
	//	D.findElement(By.xpath("//div[@class='style-scope ytd-video-renderer']")).click();
		Thread.sleep(8000);
		D.findElement(By.xpath("//span[@class='ytp-ad-skip-button-container']")).click();
		Thread.sleep(50000);
		
	/*	D.get("https://www.amazon.in/");
		Thread.sleep(3000);
		D.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi mobile");
		Thread.sleep(3000);
		D.findElement(By.id("")).sendKeys("Redmi mobile");*/
		
	}

}
