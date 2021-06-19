package com.BrowserOptionsTest;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MultipleBrowserVersionTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");

		FirefoxOptions obj=new FirefoxOptions();
		
		obj.setBinary(new FirefoxBinary(new File("E:\\Training\\PeopleNTech\\BITM Online 2\\Firefox(78)\\firefox.exe")));
		
		driver=new FirefoxDriver(obj);
		
		driver.get("https://google.com");

	}

}
