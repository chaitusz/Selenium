package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Example4 {

	WebDriver driver;

	@Test
	public void somemethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.actitime.com");
		
		Actions a = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[@href='/features']"));
		a.moveToElement(target).perform();
		
		Thread.sleep(1000);
		
		WebElement sublink = driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/ul/li[3]/a"));
		
a.moveToElement(sublink).click().perform();
	}
}