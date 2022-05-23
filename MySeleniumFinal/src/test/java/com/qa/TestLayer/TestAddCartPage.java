package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.TestBase.Testbase;

public class TestAddCartPage extends Testbase{
	@Test
	public void addcartSonyVaioI5() throws InterruptedException {
		home.clickOnLaptops();
		home.clickOnSonyVaioI5();
		utility.clickOnAddcart();
		Thread.sleep(2000);
		utility.acceptPopup();
		logger.info("Sony vioi5  test execute");
	}
	@Test
	public void addcartSonyVaioI7() throws InterruptedException {
		home.clickOnLaptops();
		home.clickOnsonyVaioI7();
		utility.clickOnAddcart();
		Thread.sleep(2000);
		utility.acceptPopup();
		logger.info("Sony vioi7  test execute");
	}
}
