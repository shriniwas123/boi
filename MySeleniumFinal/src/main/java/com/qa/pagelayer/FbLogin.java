package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.FbTestBase;

public class FbLogin extends FbTestBase {
	public FbLogin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement user ;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password ;

	@FindBy(xpath = "//button[@value='1']")
	private WebElement login ;

	public void inputuser1() {
		user.sendKeys("shri");
	}

	public void pass() {
		password.sendKeys("sunny");

	}

	public void login1() {
		login.click();
	}

}
