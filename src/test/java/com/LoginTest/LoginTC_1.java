package com.LoginTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Common.BaseClass;



public class LoginTC_1 extends BaseClass{

	@Test(description="Login test with invalid email and invalid password")
	public void login() throws IOException 
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\PropertyFiles\\OR.properties");
		Properties prop=new Properties();		
		prop.load(fis);
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		WebElement Email=driver.findElement(By.name(prop.getProperty("Email_ByName")));
		WebElement Password=driver.findElement(By.name(prop.getProperty("Password_ByName")));
		WebElement LoginBtn=driver.findElement(By.cssSelector(prop.getProperty("LoginBtn_ByCSS")));

		Email.sendKeys("marwe2323@mail.com");
		Password.sendKeys("123456");
		LoginBtn.click();

		String ExpectedErrorMessage=" Warning: No match for E-Mail Address and/or Password.";

		String ActualMessage= driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]")).getText();

		if(ExpectedErrorMessage.contains(ActualMessage))	
		{
			captureScreen(driver,"LoginTC_1");
			System.out.println("Test Case passed");
		}

		else {
			System.out.println("Test case failed.Bug found");
		}
	}
}
