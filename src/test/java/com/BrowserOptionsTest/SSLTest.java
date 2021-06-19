package com.BrowserOptionsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		
		FirefoxOptions obj=new FirefoxOptions();
		obj.setAcceptInsecureCerts(true);
			
		driver=new FirefoxDriver(obj);		
		driver.get("https://cacert.com/");
		
		System.out.println(driver.getTitle());
		
		

	}

}
