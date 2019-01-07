package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Example3 {
	WebDriver driver ;
	@Test
	public void somemethod() {
		System.setProperty("webdriver.chrome.driver", "C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement daydropdown = driver.findElement(By.cssSelector("#day"));
		
		Select s = new Select(daydropdown); 
		List<WebElement> options = s.getOptions();
		
		for(WebElement singlevalue : options)
		{
			System.out.println(singlevalue.getText());
		}
		
	}
	
	

}
