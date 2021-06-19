package com.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataDrivenTest {

	WebDriver driver;
	Workbook wb;
	Sheet sht;
	
	@BeforeTest
	public void Browser_setup() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}

	@Test
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Thread.sleep(3000);
		
		/*
		 * Start Excel implementation
		 */
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Data.xlsx");
		wb=WorkbookFactory.create(fis);
		sht=wb.getSheet("LoginData"); //Sheet name
		
		/*
		 * Getting Email and password
		 */
		Row Email_rw=sht.getRow(2);
		
		Cell Email_cel=Email_rw.getCell(0);
		
		String Email=Email_cel.getStringCellValue();
		
		/*
		 * Getting Password
		 */
		Row Password_rw=sht.getRow(2);
		Cell String_Password_cel=Password_rw.getCell(1);
		//Cell Numeric_Password_cel=sht.getRow(1).getCell(1);

		//If password String value
		String Password_String=String_Password_cel.getStringCellValue();
		
		//If numeric
		//DataFormatter formatter=new DataFormatter();
		//String Password_Numeric=formatter.formatCellValue(Numeric_Password_cel);
		
		//real Implementation
		WebElement email= driver.findElement(By.name("email"));
		WebElement password= driver.findElement(By.name("password"));
		WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));

		email.sendKeys(Email);
		password.sendKeys(Password_String);
		loginBtn.click();
		
		/*
		 * Message to be written in the excel
		 * Implement login for pass or fail
		 */
		
		FileOutputStream fout=new FileOutputStream("E:\\Training\\PeopleNTech\\BITM Online 2\\AutomationBITM02\\DynamicAutomation\\TestData\\Data.xlsx");
		
		String ExpectedTitle="My Account";
		String ActualTile=driver.getTitle();
		
		if(ExpectedTitle.equals(ActualTile))
		{
			String Result="Login Successful";
			sht.getRow(2).createCell(3).setCellValue(Result);
			System.out.println("Test pass Result write to Excel Success.");
		}
		
		else
		{
			String Result="Login un successsful";
			sht.getRow(2).createCell(3).setCellValue(Result);
			System.out.println("Test Fail Result write to Excel Success.");
		}
		
		wb.write(fout);
		fout.close();
		
		driver.close();
	}


}
