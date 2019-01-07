package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertInSelenium {
		
		WebDriver driver; 
		
		@Test
		
		public void alertinselenium() {
			
			System.setProperty("webdriver.chrome.driver",
					"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("file:///C:/Users/IBM_ADMIN/Desktop/Selenium%20WebDriver/TestApplication/startbootstrap-sb-admin-2-gh-pages/startbootstrap-sb-admin-2-gh-pages/pages/index.html#");
			
			driver.findElement(By.xpath("//a[@href='javaScriptAlert.html']")).click();
			
			driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
			
			System.out.println(driver.switchTo().alert().getText());
			
			driver.switchTo().alert().accept();
			

}
}