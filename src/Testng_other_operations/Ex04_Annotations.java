package Testng_other_operations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex04_Annotations 
{
//	It will execute only one time,before all the annotations
	@BeforeSuite
	
	public void beforeSuite()
	{
		System.out.println("Before Suite- setup browser property");
	}
	
//	It will execute only one time
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test-launch browser");
	}
	
//	it will execute only one time before all the tests in a class
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class -launch app");
	}
	
//	it will execute every time before each test
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method - Login");
	}
	
	@Test
	public void f()
	{
		System.out.println("Test01-Click first link");
	}
	
	
	@Test
	public void test02()
	{
		System.out.println("Test01-click Second link");
	}
	
//	it will execute every time after each test
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method-Logout");
	}
	
//	it will execute only one time,all the test in a class
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class-Delete cookies");
	}
	
//	it will execute only one time
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test-close browser");
	}
	
//	it will execute only one time,after all the annotation
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite-generate report");
	}
	
}
