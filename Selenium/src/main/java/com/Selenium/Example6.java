package com.Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example6 {
	
	WebDriver driver;

	@Test
	public void somemethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.cssSelector(".youtube>a")).click();
		
		Set<String> allhandles = driver.getWindowHandles();
		
		Iterator<String> itr = allhandles.iterator();
		
		String childid = itr.next();
		String parentid = itr.next();
		
		driver.switchTo().window(childid);
		
		driver.close();
		
		driver.switchTo().window(parentid);
		
		String textcopied = driver.findElement(By.cssSelector(".shop-phone")).getText();
		
		System.out.println(textcopied);

}
}