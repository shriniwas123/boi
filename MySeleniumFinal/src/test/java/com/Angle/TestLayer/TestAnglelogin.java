package com.Angle.TestLayer;

import org.testng.annotations.Test;

import com.Angle.Pagelayer.Login;
import com.AngleTestBase.AngelTestBase;

public class TestAnglelogin extends AngelTestBase{
	public static Login loginVariable;
	@Test
	public void logIntoAngle() {
		loginVariable = new Login();
		loginVariable.validateuser();
		loginVariable.validatepass();
		loginVariable.validatelogin();
		
	}
	

}
