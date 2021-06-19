package com.StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Steps   {
	
	WebDriver driver;
	
	@Given("Open Browser")
	public void open_browser() {
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@And("Launch login page")
	public void launch_login_page() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");

	}

	@When("Enter valid email and valid password")
	public void enter_valid_email_and_valid_password() throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\PropertyFiles\\OR.properties");
		Properties prop=new Properties();		
		prop.load(fis);
		
		WebElement Email=driver.findElement(By.name(prop.getProperty("Email_ByName")));
		WebElement Password=driver.findElement(By.name(prop.getProperty("Password_ByName")));
		WebElement LoginBtn=driver.findElement(By.cssSelector(prop.getProperty("LoginBtn_ByCSS")));

		Email.sendKeys("mail22@mail.com");
		Password.sendKeys("123456");
		LoginBtn.click();

	}

	@Then("Login successful")
	public void login_successful() {
		
		String ExpectedTitle="My Account";

		String ActuaTitle= driver.getTitle();

		if(ExpectedTitle.contains(ActuaTitle))	
		{		
			System.out.println("Test Case passed");
		}

		else {		
			System.out.println("Test case failed.Bug found");
		}
		
		driver.close();
	    
	}
	
}
