import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggetionBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	WebElement	web = driver.findElement(By.xpath("//input[@name='q']"));
		web.sendKeys("car");
	List<WebElement> li =	driver.findElements(By.xpath("//div/ul/li"));
	System.out.println(li.size());
	driver.quit();
	}

}
