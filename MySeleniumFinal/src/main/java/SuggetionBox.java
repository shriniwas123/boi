import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggetionBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	WebElement	web = driver.findElement(By.xpath("//input[@name='q']"));
		web.sendKeys("selenium");
		Thread.sleep(2000);
List<WebElement> li =driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));

     for(int i=0;i<li.size();i++) {
    	 WebElement element= li.get(i);
    	 System.out.println(li.get(i).getText());
    	
    	 if(li.get(i).getText().equalsIgnoreCase("selenium testing")) {
    	element.click();
    	break;
    	 }
     }

	System.out.println(li.size());
	//driver.quit();
	}

}
