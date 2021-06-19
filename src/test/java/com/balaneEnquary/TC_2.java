package com.balaneEnquary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_2 {
	
	WebDriver driver;
	WebElement Account=driver.findElement(By.id("Account"));
	WebElement SubmitBtn=driver.findElement(By.id("SubmitBtn"));
	
  @Test
  public void S1() {
	  String ExpectedMessage="Account no is required";
	  Account.sendKeys("");
	  SubmitBtn.click();
	  WebElement message=driver.findElement(By.id("message"));
	  String ActualMessage=message.getText();
	  
	  if(ExpectedMessage.equals(ActualMessage))
	  {
		  System.out.println("Test passed.");
	  }
	  
	  else {
		  System.out.println("Test failed.");
	  }
	  
  }
  
  @Test
  public void S2() {
	  String ExpectedMessage="Characters are not allowed";
	  Account.sendKeys("abc");
	  SubmitBtn.click();
	  WebElement message=driver.findElement(By.id("message"));
	  String ActualMessage=message.getText();
	  
	  if(ExpectedMessage.equals(ActualMessage))
	  {
		  System.out.println("Test passed.");
	  }
	  
	  else {
		  System.out.println("Test failed.");
	  }
  }
	  
	  @Test
	  public void S3() {
		  String ExpectedMessage="Special Characters are not allowed";
		  Account.sendKeys("abc");
		  SubmitBtn.click();
		  WebElement message=driver.findElement(By.id("message"));
		  String ActualMessage=message.getText();
		  
		  if(ExpectedMessage.equals(ActualMessage))
		  {
			  System.out.println("Test passed.");
		  }
		  
		  else {
			  System.out.println("Test failed.");
		  }
  }
  
}
