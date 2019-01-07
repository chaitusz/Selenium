package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorInSelenium {
	WebDriver driver; 
	
	@Test
	public void javascriptexecutorinselenium() throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver",
			//	"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		js.executeScript("document.getElementById('email').setAttribute('value','abcd@gmail.com')");
//		
//		
//		Thread.sleep(3000);
//		
//		js.executeScript("document.getElementsByClassName('inputtext')[1].setAttribute('value','password')");
//		
//		Thread.sleep(3000);
//		
		
//		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@aria-label='Log In']")));
//		
//		Thread.sleep(4000);
		
		String check = js.executeScript("return document.domain;").toString();
		System.out.println(check);
		
		String URL = js.executeScript("return documnet.URL;").toString();
		System.out.println(URL);
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		
		driver.close();
		
		
		
	}

}
