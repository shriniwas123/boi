package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Newyoutube {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//input[@id ='search']")).sendKeys("mai sharabi");
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//button[@id ='search-icon-legacy']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		//*[@id="skip-button:5"]/span/button
		Thread.sleep(8000);

		Driver.findElement(By.xpath("//*[@id=\"skip-button:5\"]/span/button")).click();
		Thread.sleep(40000);
	//	WebElement Progess=Driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[27]/div[1]/div[2]/div[6]"));
	//	Actions a= new Actions(Driver);
	//	a.dragAndDropBy(Progess, 100, 0);
		
	}

}
