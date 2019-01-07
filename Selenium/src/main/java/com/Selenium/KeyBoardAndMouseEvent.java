package com.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardAndMouseEvent {
	
WebDriver driver; 
	
	@Test
	public void keyboardandmouseeventsusingactionsclassinselenium() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
//		WebElement source = driver.findElement(By.xpath("chapak"));
//	a.dragAndDropBy(source, 300, 400);
	

		
		
		a.click(driver.findElement(By.xpath("//input[@title='Search']"))).keyDown(Keys.SHIFT).sendKeys("chaitanya").keyUp(Keys.SHIFT).sendKeys(" ajjarapu").build().perform();
		
		Thread.sleep(4000);
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
			if(options.get(i).getText().equals("ajjarapura"))
			{
				int linumreq = ++i;
				System.out.println(linumreq);
				//driver.findElement(By.xpath("//ul[@class='erkvQe']/li[i]")).click();
				System.out.println("This string is present in the search suggestions");
				
				String firstpart = "//ul[@class='erkvQe']/li[";
				String secondpart = "]";
				String finalpart = firstpart + linumreq + secondpart;
				
				driver.findElement(By.xpath(finalpart)).click();
				
			}
			
			
		}
		
		
		
		
	}

}
