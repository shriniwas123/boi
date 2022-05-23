import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//button[@class='_2KpZ6l _2doB4z']
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		JavascriptExecutor j= ((JavascriptExecutor)driver);
		j.executeScript("scroll(0,1000)");
		
		
	}

}
