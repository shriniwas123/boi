package windowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
List <WebElement>  web=	driver.findElements(By.tagName("a"));
System.out.println(web.size());

for(int i=0;i<web.size();i++) {
	System.out.println(web.get(i).getText());
	
}
driver.findElement(By.linkText(web.get(1).getText())).click();
Set <String> name =driver.getWindowHandles();
ArrayList l= new  ArrayList(name);
driver.switchTo().window((String) l.get(0));

}

}
