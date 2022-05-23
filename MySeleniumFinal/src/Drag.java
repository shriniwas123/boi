import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {


	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(3000);
		WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act= new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
	

}
