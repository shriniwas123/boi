package com.qa.testLayer;

import org.testng.annotations.Test;


import com.qa.pagelayer.TestBase;

public class TestHomePageClass extends TestBase{
	
	@Test
	public void testPhoneOption() {
		
		h.clickOnPhone();
	}
	@Test
	public void testSamsungS6() {
		
		h.clickOnSamsungS6();
	}
	@Test
	public void testNokiaLumia() {
		h.clickOnNokiaLumia();
	}
	

}
