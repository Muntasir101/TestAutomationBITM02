package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		driver=new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
		
		Select drdw=new Select(dropdown);
		
		//drdw.selectByIndex(1);
		
		//drdw.selectByValue("1");
		
		drdw.selectByVisibleText("Option 2");
		

	}

}
