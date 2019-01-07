package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example7 {
	WebDriver driver;
	String desiredMonth="June 2019";
	String desiredDate = "21";

	@Test
	public void somemethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");	
		
		driver.findElement(By.cssSelector("*[name='checkin']")).click();
		
	WebElement month = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[2]"));

		while(true)
		{
			if(month.getText().equals(desiredMonth)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[3]")).click();
				Thread.sleep(1000);
			}
		}
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu']"
				+ "[1]/div[1]/table/tbody/tr/td[contains(text(),'"+desiredDate+"')]")).click();;
		
		
}
}
