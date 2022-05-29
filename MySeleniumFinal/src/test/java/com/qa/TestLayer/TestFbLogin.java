package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.TestBase.FbTestBase;


public class TestFbLogin extends FbTestBase {
	@Test
	public void loginPagetest1() {
		F.inputuser1();

		F.pass();

		F.login1();
	}

}
