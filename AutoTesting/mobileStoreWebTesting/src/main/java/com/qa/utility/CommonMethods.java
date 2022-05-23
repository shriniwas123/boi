package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.Testbase;

public class CommonMethods extends Testbase {
	public CommonMethods() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //a[contains(text(),'Add to cart')]")
	private WebElement addCart;

	public void clickOnAddcart() {
		addCart.click();
	}

	public void acceptPopup() {
		driver.switchTo().alert().accept();
	}

	public static void screenShot(String photoname) {

		try {

			TakesScreenshot take = ((TakesScreenshot) driver);
			File src1 = take.getScreenshotAs(OutputType.FILE);

			String folderPath = "C:\\Users\\shriniwas shete\\Desktop\\boi\\mobileStoreWebTesting\\test-output\\screenshot\\";

			File destination = new File(folderPath + photoname + System.currentTimeMillis() + ".png");

			FileHandler.copy(src1, destination);
		} 
		
		catch (IOException e) {
			System.out.println(" file not found");
			e.printStackTrace();
		}

	}
}
