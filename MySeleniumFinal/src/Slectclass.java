import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Slectclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/reg/?rs=7");
		d.findElement(By.xpath("//select[@name='birthday_day']")).click();
WebElement a=	d.findElement(By.xpath("//select[@name='birthday_day']"));
      Select z= new Select(a);
      z.selectByIndex(23);
		
	}

}
