package seleniumProject;


import org.openqa.selenium.chrome.ChromeDriver;

public class MyProject {
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\New folder (2)\\chromedriver.exe" );
		ChromeDriver		 D= new ChromeDriver();
		
		
		D.get("https://www.flipkart.com/");
	
	}

}
