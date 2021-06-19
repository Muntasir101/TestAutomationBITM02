package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {

	public static void main(String[] args) {
		/*
		 * Step 1: Launch Browser
		 * Step 2: Open Test Site
		 * Step 3: Test 
		 * WebDriver: Interface 
		 * driver: reference variable
		 * new: keyword
		 * FirefoxDriver(): Constructor of FirefoxDriver Class
		 */

		//Step 1
		WebDriver driver;
		
		//For Firefox
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		//For Chrome
		System.setProperty("webdriver.chrome.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//Step 2
	//	driver.get("https://google.com/");
		
		// Offline Test
		//driver.get("file:///C:/Users/munta/OneDrive/Desktop/Your Store.html");
		
		//driver.close();
		
		//driver.quit();
		
	}

}
