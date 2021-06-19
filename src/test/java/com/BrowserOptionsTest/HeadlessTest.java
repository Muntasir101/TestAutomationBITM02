package com.BrowserOptionsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");

		FirefoxOptions obj=new FirefoxOptions();
		obj.setHeadless(true);

		driver=new FirefoxDriver(obj);		
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
