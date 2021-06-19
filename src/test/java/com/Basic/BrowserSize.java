package com.Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Set specific screen size
 * ex: Width=1000; Height: 500
 *   
 */

public class BrowserSize {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		
		//Get Size
		int Width=driver.manage().window().getSize().getWidth();
		int Height=driver.manage().window().getSize().getHeight();
		System.out.println("Default Width: "+Width);
		System.out.println("Default Height: "+Height);
		
		
		//Set Specific window size
		driver.manage().window().setSize(new Dimension(1000,500));
		
		
		//driver.close();
		

	}

}
