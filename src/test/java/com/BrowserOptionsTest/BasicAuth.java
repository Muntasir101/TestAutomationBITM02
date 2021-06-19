package com.BrowserOptionsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicAuth {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		//formula: protocol://username:password@url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
