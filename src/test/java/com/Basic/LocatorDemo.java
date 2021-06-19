package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//Identify Email input field 
		WebElement Email=driver.findElement(By.id("input-email"));
		
		//Identify password input field 
		WebElement Password=driver.findElement(By.name("password"));
		
		//Identify Login Button
		WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
		
		//Test case for Valid Email and password
		/*
		String ExpetedPostCondition="My Orders";
		Email.sendKeys("mail22@mail.com");
		Password.sendKeys("123456");
		LoginBtn.click();
		
		String ActualText= driver.findElement(By.cssSelector("#content > h2:nth-child(3)")).getText();
		
		if(ExpetedPostCondition.equals(ActualText))
		{
			System.out.println("Login success.Test case passed");
		}
		else
		{
			System.out.println("Test case failed. Bug found.");
		}
		*/
		

		//Test case for in Valid Email and password
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

}
