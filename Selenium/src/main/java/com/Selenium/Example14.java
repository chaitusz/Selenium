package com.Selenium;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example14 {
	
	WebDriver driver;

	@Test
	public void somemethod() throws InterruptedException, ParseException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://my.monsterindia.com/create_account.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#cat")).click();
	
		driver.findElement(By.xpath("//div[@title='Admin/Secretarial']/preceding-sibling::div[1]")).click();
		
		driver.findElement(By.xpath("//div[@title='Admin/Secretarial']/preceding-sibling::div[1]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@title='Admin/Secretarial']/preceding-sibling::div[1]")).isSelected());
		
		driver.findElement(By.xpath("//div[@class='right clip_image closedropdown']")).click();
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}		

}
