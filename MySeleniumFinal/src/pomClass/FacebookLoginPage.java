package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement pass;
	@FindBy(xpath = "//button[@name='login']")
	private WebElement login;

	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void EnterEmailOrNumber() {
		email.sendKeys("7798900745");
	}

	public void EntrePass() {
		pass.sendKeys("Boi@1997");
	}

	public void ClickLogin() {
		login.click();
	}
	

}


