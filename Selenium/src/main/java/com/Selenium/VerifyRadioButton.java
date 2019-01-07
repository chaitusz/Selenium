package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyRadioButton {
	
	WebDriver driver; 
	@Test
	public void verifyradiobutton() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/checkboxradio/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		
		 
		driver.findElement(By.xpath("//div[@class='widget']/fieldset/label[@for='radio-1']")).click();
		
	}

}
