package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		driver=new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/windows");
		
		String ParentGUID=driver.getWindowHandle();
		
		WebElement newWinBtn=driver.findElement(By.cssSelector("#content > div > a"));
		
		newWinBtn.click();
		Thread.sleep(5000);
	
		
		//Get all GUID 
		Set<String> allGUID=driver.getWindowHandles();
		System.out.println(allGUID);
		
		System.out.println(allGUID.size());
	
		
		//Switch to Child
		for(String ChildGUID:allGUID)
		{
			if(!ChildGUID.equals(ParentGUID))
			{
				driver.switchTo().window(ChildGUID);
				System.out.println("Child Window Title: "+driver.getTitle());

				break;
			}
		}
		
		//Switch to Parent
		for(String ChildGUID:allGUID)
		{
			if(!ChildGUID.equals(ParentGUID))
			{
				driver.switchTo().window(ParentGUID);
	
				System.out.println("Parent Window Title :"+driver.getTitle());
				
				break;
			}
		}
				
		
		driver.quit();

	}

}
