package com.Angle.Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AngleTestBase.AngelTestBase;

public class Login extends AngelTestBase {
	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input [@id='txtUserID']")
	private WebElement enterusrId;
	@FindBy(xpath = "//input [@id='txtTradingPassword']")
	private WebElement enterPassw;
	@FindBy(xpath = "//a [@id='loginBtn']")
	private WebElement clicklogi;
	@FindBy()
	
	public void validateuser() {
		enterusrId.sendKeys("s305399"); 
	}
	public void validatepass() {
		enterPassw.sendKeys("Boi@1997");
	}
	public void validatelogin(){
		clicklogi.click(); 
	}
}
