package com.Selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookiesInSelenium {
	
	WebDriver driver ;
	
	@Test
	public void deletecookiesinselenium(){
		
		System.setProperty("webdriver.chrome.driver","C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.manage().deleteCookieNamed("gpv_pn_t");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for(Cookie indcookie:cookies)
		{
			System.out.println(indcookie+"|||||||");
		}
		
	}

}
