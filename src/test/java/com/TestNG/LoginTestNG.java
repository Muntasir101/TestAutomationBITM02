package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestNG {

	WebDriver driver;

	@BeforeMethod
	public void openTestURL()
	{
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	}

	@AfterMethod
	public void closeTestTab()
	{
		driver.close();
	}

	@BeforeTest
	public void browserConfig() 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		driver=new FirefoxDriver();
	}

	@Test(description="Login test with invalid email and invalid password")
	public void login() 
	{

		WebElement Email=driver.findElement(By.id("input-email"));

		WebElement Password=driver.findElement(By.name("password"));

		WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));

		Email.sendKeys("marwe2323@mail.com");
		Password.sendKeys("123456");
		LoginBtn.click();

		String ExpectedErrorMessage=" Warning: No match for E-Mail Address and/or Password.";

		String ActualMessage= driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText();

		if(ExpectedErrorMessage.contains(ActualMessage))	
		{
			System.out.println("Test Case passed");
		}

		else {
			System.out.println("Test case failed.Bug found");
		}
	}

	@AfterTest
	public void closeTest() 
	{
		driver.quit();
	}


}
