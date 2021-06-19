package com.balaneEnquary;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_1 {
	
	WebDriver driver;
  @Test
  public void f1() {
	  
	  driver.get("https://demo.opencart.com/index.php?route=account/login");
  }
  
  
}
