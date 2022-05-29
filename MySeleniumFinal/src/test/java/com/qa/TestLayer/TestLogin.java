package com.qa.TestLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.TestBase.Testbase;

public class TestLogin extends Testbase {
	
	@Test
	public void TeastUser() throws IOException, InterruptedException {
		login.clickOnlogin();
		login.EnterUsername(test.juniorCode(1, 0));
		Thread.sleep(3000);
		login.Enterpass(test.juniorCode(1, 1));
		Thread.sleep(3000);
		login.clickOnlogin2();
	}
		
		@Test
		public void TeastUser2() throws IOException, InterruptedException {
			login.clickOnlogin();
			login.EnterUsername(test.juniorCode(0, 0));
			Thread.sleep(3000);
			login.Enterpass(test.juniorCode(0, 1));
			Thread.sleep(3000);
			login.clickOnlogin2();
		
	}
	

}
