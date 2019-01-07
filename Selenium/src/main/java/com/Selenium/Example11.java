package com.Selenium;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example11 {
	
WebDriver driver;

	
	@SuppressWarnings("unused")
	@Test
	public void somemethod() throws InterruptedException, ParseException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//IBM_ADMIN//eclipse-workspace//Selenium//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String row = "//table[@class='dataTable']/tbody/tr";
		int rowsize = driver.findElements(By.xpath(row)).size();
		
		WebElement CurrentPrice = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		String firstpart = "//table[@class='dataTable']/tbody/tr[";
		String secondpart = "]/td[4]";
		
		ArrayList<Integer> array = new ArrayList<Integer>();
				for(int i=1;i<rowsize-920;i++)
				{
					String finalpart = firstpart + i + secondpart;
					System.out.println(finalpart);
					String price = driver.findElement(By.xpath(finalpart)).getText();
					
					NumberFormat numberformat = NumberFormat.getNumberInstance();
					Number num = numberformat.parse(price);
					price = num.toString();
					System.out.println(price);
				
					Double dprice = Double.parseDouble(price);
					int intprice = dprice.intValue();
					
					System.out.println(intprice);
					array.add(intprice);
				}
				
				Collections.sort(array);
				System.out.println(array);
				System.out.println(array.get(array.size()-1));		
		
	}	
		

}
