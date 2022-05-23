package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ArtifactTest {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("1. ---beforeSuite");
	}
	
	@BeforeGroups
	public void beforeTest()
	{
		System.out.println("2. ---beforeTest");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("3. ---beforeClass");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("4. ---beforeMethod");
	}
	
	
	@Test
	public void testcase1()
	{
		System.out.println("0. ---testcase1");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("5. ---afterMethod");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("6. ---afterClass");
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("7. ---afterTest");
	}
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("8. ---afterSuite");
	}

}
