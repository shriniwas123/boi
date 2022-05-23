package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.TestBase.Testbase;

public class TestClassHomePage extends Testbase {
	@Test
	public void testLaptop() {
		home.clickOnLaptops();
	}
	@Test
	public void testSonyVoioi5() {
		home.clickOnLaptops();
		home.clickOnSonyVaioI5();
		
	}
	@Test
	public void testSonyVoioi7() {
		home.clickOnLaptops();
		home.clickOnsonyVaioI7();
	}
	@Test
	public void testmacBookAi() {
		home.clickOnLaptops();
		home.clickmacBookAi();
	}


}
