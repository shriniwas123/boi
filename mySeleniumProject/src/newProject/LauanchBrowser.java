package newProject;

import org.openqa.selenium.WebDriver;

public class LauanchBrowser {
	public static void main (String [] args) {
	// "D:\New folder\chromedriver.exe"
		System.setProperty("webdriver.chrome.driver" , "D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	}
}
