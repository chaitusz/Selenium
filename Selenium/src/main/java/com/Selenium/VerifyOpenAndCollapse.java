package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOpenAndCollapse {
	WebDriver driver ;
	@Test
public void verifyopenandcollapse() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank/bank-online/netbanking");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='accordian1']/h3")).click();
		
		String classname = driver.findElement(By.xpath("//div[@id='accordian1']/h3")).getAttribute("class");
		String expectedclassname = "clearfix open active";
		if(classname.contains(expectedclassname))
		{
			Assert.assertTrue(true, "class name is being changed after clicking the downward dropdown");
			
		}
		Assert.assertFalse(false, "Something is not right buddy");
		
		
		
	}

}
