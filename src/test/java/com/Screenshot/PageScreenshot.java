package com.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Training\\PeopleNTech\\BITM Online 2\\Tools\\geckodriver.exe");
		driver=new FirefoxDriver();

		driver.get("https://google.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//take screenshot
		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Save
		FileUtils.copyFile(SrcFile, new File("E:\\Training\\PeopleNTech\\BITM Online 2\\Screenshot\\PageSereenshot.png"),true);

		driver.close();
		
	}

}
