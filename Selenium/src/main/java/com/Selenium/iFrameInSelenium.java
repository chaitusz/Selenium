package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrameInSelenium {
	
		
		WebDriver driver; 
		
		@Test
		
		public void iframeinselenium() {
			
			System.setProperty("webdriver.chrome.driver",
					"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("file:///C:/Users/IBM_ADMIN/Desktop/Selenium%20WebDriver/TestApplication/startbootstrap-sb-admin-2-gh-pages/startbootstrap-sb-admin-2-gh-pages/pages/forms.html");

			 driver.switchTo().frame(0);
}
}