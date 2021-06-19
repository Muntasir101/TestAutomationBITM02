package com.LoginTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Common.BaseClass;

public class LoginTC_2 extends BaseClass{

	@Test(description="Login test with valid email and valid password")
	public void login() throws IOException 
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\PropertyFiles\\OR.properties");
		Properties prop=new Properties();		
		prop.load(fis);
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		WebElement Email=driver.findElement(By.name(prop.getProperty("Email_ByName")));
		WebElement Password=driver.findElement(By.name(prop.getProperty("Password_ByName")));
		WebElement LoginBtn=driver.findElement(By.cssSelector(prop.getProperty("LoginBtn_ByCSS")));

		Email.sendKeys("mail22@mail.com");
		Password.sendKeys("123456");
		LoginBtn.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String ExpectedTitle="22";

		String ActuaTitle= driver.getTitle();

		if(ExpectedTitle.contains(ActuaTitle))	
		{
			captureScreen(driver,"LoginTC_2");
			System.out.println("Test Case passed");
		}

		else {
			captureScreen(driver,"LoginTC_2_Bug");
			System.out.println("Test case failed.Bug found");
		}
	}
}
