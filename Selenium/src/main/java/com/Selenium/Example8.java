package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example8 {

	WebDriver driver;

	
	@Test
	public void somemethod() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		
		driver.findElement(By.xpath("//a[@title='Hotels']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='s2id_autogen8']/a/span[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@id='select2-drop'][1]/div/input")).sendKeys("Block");

		Thread.sleep(3000);

		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='select2-result-sub']/li"));
		int i = 0;
		System.out.println("size of the elements available in the suggestions is / are :" + suggestions.size());

		while (i < suggestions.size()) {

			System.out.println(suggestions.get(i).getText());

			if (suggestions.get(i).getText().equals("Tuli Block, Botswana")) {
				suggestions.get(i).click();
				break;
			}
			i++;

		}
/***
 * The below thing selects the desired month from the calendar field value. 
 */
		String desiredMonth="June 2019";
		String desiredDate = "21";
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
			
			driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu']"
					+ "[1]/div[1]/table/tbody/tr/td[contains(text(),'"+desiredDate+"')]")).click();;
			
			String desiredCheckoutMonth="August 2019";
			String desiredCheckoutDate="22";
			
			Thread.sleep(1000);
			
			WebElement checkoutMonth = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][2]/div[1]/table/thead/tr[1]/th[2]"));
			
			while(true) {
				
				if(checkoutMonth.getText().equals(desiredCheckoutMonth))
				{
					break;
				}
				else {
					driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][2]/div[1]/table/thead/tr[1]/th[3]")).click();
					Thread.sleep(100);
				}
				
			}

			driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr/td[contains(text(),'"+desiredCheckoutDate+"')]")).click();;
		
		
					Thread.sleep(1000);
					
					
		/**
		 * now I am going to select the no.of adults and no.of child
		 */
					
		driver.findElement(By.xpath("//input[@id='travellersInput']")).click();
		Thread.sleep(100);

		String adultcount = "5";
		String childcount = "7";

		WebElement adultBoxCountContent = driver.findElement(By.cssSelector("#adultInput"));
		WebElement childBoxCountContent = driver.findElement(By.cssSelector("#childInput"));
		System.out.println("*****************************");
		System.out.println(adultBoxCountContent.getAttribute("value"));
		System.out.println(childBoxCountContent.getAttribute("value"));
		System.out.println("*****************************");

		while (true) {

			if(adultBoxCountContent.getAttribute("value").equals(adultcount)) {
				break;
			}
			else {
				driver.findElement(By.cssSelector("#adultPlusBtn")).click();
			}
		}
		
		while(true) {
			
			if(childBoxCountContent.getAttribute("value").equals(childcount)) {
				break;
			}
			else {
				driver.findElement(By.cssSelector("#childPlusBtn")).click();
			}
		}
		
		/**
		 * Finally clicking on Submit button 
		 */
		
		driver.findElement(By.xpath("/html/body/div[5]/section/div[2]/div/div/div[2]/div/div[1]/form/div[5]/button")).click();
		
	}
	
}