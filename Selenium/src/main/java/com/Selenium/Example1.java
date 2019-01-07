package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {
	
	WebDriver driver ;
	
	@Test
	public void enterDataInTextField() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("usernameCheck");
		 
	}

}
