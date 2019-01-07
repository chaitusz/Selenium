package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollInSelenium {
	
	WebDriver driver; 
	
	@Test
	
	public void scrollinselenium() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tirerack.com/content/tirerack/desktop/en/homepage.html");
		
		//JavascriptExecutor js = (JavascriptExecutor)driver; 
	
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,1500)");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1500)");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//a[@class='greyRdBtn'][contains(text(),'Find')]")));
		
		Thread.sleep(3000);
		
		
		
				driver.close();
		
		
	}

}
