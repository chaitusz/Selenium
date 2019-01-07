package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardAndMouseEventsUsingActionsClassInSelenium {
	
	WebDriver driver; 
	
	@Test
	public void keyboardandmouseeventsusingactionsclassinselenium() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement link = driver.findElement(By.xpath("//a[@title='Selenium Projects']"));
		
		Actions a = new Actions(driver);
		
		a.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		
		
		
	}

}
