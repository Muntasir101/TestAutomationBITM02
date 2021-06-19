package com.balaneEnquary;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_3 {
	
	WebDriver driver;
  @Test
  
  public void f() {
	  
	  driver.get("https://demo.opencart.com/index.php?route=account/login");
  }
}
