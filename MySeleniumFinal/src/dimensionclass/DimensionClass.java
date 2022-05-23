package dimensionclass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.zomato.com/");
	Dimension D= new Dimension(500, 200);
	driver.manage().window().setSize(D);
	Point P =new Point(0,500);
	driver.manage().window().setPosition(P);
	
	
}

}
