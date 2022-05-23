package locators;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class GoogleXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com/webhp?authuser=1");
	//WebElement w=	d.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("youtube");
	WebElement w=	d.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

		Thread.sleep(3000);
		Point p= w.getLocation();
		System.out.println(p);
		Dimension m =w.getSize();
		int width= m.getWidth();
		System.out.println(m);
		System.out.println(width);
		w.sendKeys("selenium");
		List <WebElement> list= d.findElements(By.xpath("//div  [contains(text(),'selenium')])"));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}

		
		
	//	d.findElement(By.xpath("//input[@class='gNO89b']")).click();
		//a//h3[@class='LC20lb MBeuO DKV0Md']
		//d.findElement(By.xpath("//a//h3[@class='LC20lb MBeuO DKV0Md']")).click();
	}

}
