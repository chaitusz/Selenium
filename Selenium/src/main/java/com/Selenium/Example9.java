package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example9 {
	
WebDriver driver;

	
	@Test
	public void somemethod() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		int rowscount = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		
		System.out.println("No.of rows available in the table are :"+rowscount);
		
		int colcount = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		
System.out.println("No.of columns available in the table are :"+colcount);
}
}