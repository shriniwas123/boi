package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.Testbase;

public class LoginPage extends Testbase {

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@id='login2']")
	private WebElement login_buuton;

	@FindBy(xpath = "//input[@id='loginusername']")
	private WebElement User_name;

	@FindBy(xpath = "//input[@id='loginpassword']")
	private WebElement pass;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement login_buuton2;

	public void clickOnlogin() {
		login_buuton.click();
	}

	public void EnterUsername( String username) {
		User_name.sendKeys(username);
	}

	public void Enterpass(String password) {
		pass.sendKeys(password);
	}

	public void clickOnlogin2() {
		 login_buuton2.click();
	}

}
