package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
	public  HomePage() {
		PageFactory.initElements(Driver, this);
		}
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	private WebElement phone;
	
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	private WebElement samsungS6;
	
	@FindBy(xpath="//a[contains(text(),'Nokia lumia 1520')]")
	private WebElement nokiaLumia;
	
	public void clickOnPhone() {
		phone.click();
	}
	public void clickOnSamsungS6() {
		samsungS6.click();
	}
	public void clickOnNokiaLumia() {
		nokiaLumia.click();
	}
	
	}
