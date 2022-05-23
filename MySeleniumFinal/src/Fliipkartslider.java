import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Fliipkartslider {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\New folder (2)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		WebElement  doubleclick = driver.findElement(By.xpath("//a[text()='jQuery UI']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleclick).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
