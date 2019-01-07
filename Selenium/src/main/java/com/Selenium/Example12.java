package com.Selenium;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example12 {
	
WebDriver driver;

	@Test
	public void somemethod() throws InterruptedException, ParseException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String row = "//table[@class='dataTable']/tbody/tr";
		int rowsize = driver.findElements(By.xpath(row)).size();
		
		System.out.println(rowsize);
		
	String col = "//table[@class='dataTable']/tbody/tr[1]/td";
	
	int colsize = driver.findElements(By.xpath(col)).size();
	
	System.out.println(colsize);
	
	String firstpart = "//table[@class='dataTable']/tbody/tr[" ;
	String secondpart = "]/td[";
	String thirdpart = "]";
			
	
	for(int i=1;i<rowsize-925;i++)
	{
		for( int j=1;j<=colsize;j++) 
		{
			String finalpart = firstpart+i+secondpart+j+thirdpart; 
			String result = driver.findElement(By.xpath(finalpart)).getText();
			System.out.print(result+" | ");
		}
		System.out.println();
	}
		
		
	}	
		

}
