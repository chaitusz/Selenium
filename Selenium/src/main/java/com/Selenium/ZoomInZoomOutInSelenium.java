package com.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoomInZoomOutInSelenium {
	WebDriver driver;

	@Test
	public void zoominzoomoutinselenium() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='40%'");

		Thread.sleep(4000);

		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='5%'");

		Thread.sleep(8000);

		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'");

		Thread.sleep(4000);
	}

}
