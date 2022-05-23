package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver Y = new ChromeDriver();
		Y.get("https://www.youtube.com/watch?v=6-r9PVI94hE");
		Y.manage().window().maximize();
		Thread.sleep(6000);
		Y.quit(); 
		
	
	}

}
