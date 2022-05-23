package com.qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.Testbase;

public class HomePage extends Testbase {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Laptops')]")
	private WebElement laptop;

	@FindBy(xpath = "//a[contains(text(),'Sony  i5')]")
	private WebElement sonyVaioI5;

	@FindBy(xpath = "//a[contains(text(),'Sony vaio i7')]")
	private WebElement sonyVaioI7;

	@FindBy(xpath = "//a[contains(text(),'MacBook air')]")
	private WebElement macBookAi;

	public void clickOnLaptops() {
		laptop.click();
		logger.info("click on laptop method start");
	}

	public void clickOnSonyVaioI5() {
		sonyVaioI5.click();
		logger.info("click on SonyVaioI5 laptop method start");
	}

	public void clickOnsonyVaioI7() {
		sonyVaioI7.click();
		logger.info("click on SonyVaioI7 laptop method start");
	}

	public void clickmacBookAi() {
		sonyVaioI7.click();
		logger.info("click on mac laptop method start");
	}

}
