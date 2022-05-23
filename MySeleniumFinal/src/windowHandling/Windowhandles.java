package windowHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[@class='mTxt']")).click();
		
		
		
	Set <String> sw=	driver.getWindowHandles();
	ArrayList a=new ArrayList(sw);
	System.out.println(a.get(0));
	System.out.println(driver.getTitle());
	driver.switchTo().window((String) a.get(0));
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("manual testing jobs");
	
	
		
		
		
	}

}
