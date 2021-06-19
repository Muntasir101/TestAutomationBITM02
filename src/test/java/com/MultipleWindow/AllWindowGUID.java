package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllWindowGUID {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		driver=new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/windows");
		
		WebElement newWinBtn=driver.findElement(By.linkText("Click Here"));
		
		newWinBtn.click();
		
		//Get all GUID 
		Set<String> allGUID=driver.getWindowHandles();
		System.out.println(allGUID);
		
		System.out.println(allGUID.size());
		
		driver.quit();

	}

}
