package com.Common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Rough {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\PropertyFiles\\OR.properties");
		Properties prop=new Properties();		
		prop.load(fis);
		
		System.out.println(prop.getProperty("Email_ByID"));
		System.out.println(prop.getProperty("LoginBtn_ByCSS"));
		
	}

}
