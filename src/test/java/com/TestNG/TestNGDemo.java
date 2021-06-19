package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	static int a=10;
	static int b=5;

	@BeforeMethod
	public void before()
	{
		System.out.println("I am from @BeforeMethod");
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("I am from @AfterMethod");
	}
	
	@Test(priority=-2)
	public void sum() 
	{
		System.out.println("I am from @BeforeTest");
		int sum=a+b;
		System.out.println(sum);
	}
	
	@Test(priority=-1)
	public void sub() 
	{
		System.out.println("I am from @Test");
		int sub=a-b;
		System.out.println(sub);
	}
	
	@Test(enabled=true)
	public void demo() 
	{
		System.out.println("I am from Demo");

	}
	
	@AfterTest
	public void Multiply() 
	{
		System.out.println("I am from @AfterTest");
		int multy=a*b;
		System.out.println(multy);
	}
	
	
}
