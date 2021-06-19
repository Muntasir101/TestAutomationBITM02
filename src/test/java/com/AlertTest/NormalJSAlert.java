package com.AlertTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NormalJSAlert {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		driver=new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement JSAlert=driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button"));
		
		JSAlert.click();
		
		driver.switchTo().alert().accept();
	}

}
