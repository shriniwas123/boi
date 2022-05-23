package pomMainClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pomClass.FacebookLoginPage;
import pomLogout.FbLogout;

public class MainMethodClass {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		FacebookLoginPage log = new FacebookLoginPage(driver);
		log.EnterEmailOrNumber();
		log.EntrePass();
		log.ClickLogin();
	//	Thread.sleep(5000);
		FbLogout out= new FbLogout(driver);
		out.mbutton();
		Thread.sleep(5000);
		out.clickout(); 

	}

}
