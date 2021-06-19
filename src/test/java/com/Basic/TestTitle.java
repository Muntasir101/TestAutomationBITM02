package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTitle {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://google.com");
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		String PageSource=driver.getPageSource();
		
		if(PageSource.contains(Title))
		{
			System.out.println("Test Passed");
		}

	}

}
