package windowHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");//index0
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='mTxt'])[1]")).click();// job vr click kela ----index 1
		driver.findElement(By.xpath("(//div[@class='mTxt'])[2]")).click();// service vr click kela-----index 2
		
	Set <String> web=	driver.getWindowHandles();
	ArrayList lis =new ArrayList(web);
	driver.switchTo().window((String) lis.get(1));
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='qp']")).sendKeys("capgemini");
	Thread.sleep(5000);
	driver.switchTo().window((String) lis.get(2));
		
	}

}
