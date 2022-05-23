import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrops {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("sofa ");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		WebElement src=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div/div/section[2]/div[3]/div[1]/div[1]/div"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
	
		
		action.dragAndDropBy(src, 100, 0); 
		Thread.sleep(3000);
		driver.quit();
		
	}

}
