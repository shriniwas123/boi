import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\New folder (2)\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("link");
	WebElement w=	d.findElement(By.xpath("path"));
     Select s = new Select(w);
     s.selectByIndex(0);
     
     d.quit();
     System.out.println("shriniwas /nyogya");
		
	}

}
