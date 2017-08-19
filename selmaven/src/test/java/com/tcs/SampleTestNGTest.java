package com.tcs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGTest {
	
	public WebDriver driver;
	public String baseUrl;
	
	@BeforeTest
	public void setBaseUrl(){
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://demo.guru99.com/selenium/newtours/";
        driver.get(baseUrl);
	}
	
	@Test
	public void testTitle(){
		String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
       
        actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void testTitle2(){
		 WebElement userName = driver.findElement(By.name("userName"));
	     WebElement passWord = driver.findElement(By.name("password"));
	     userName.sendKeys("test");
	     passWord.sendKeys("test");
	     driver.findElement(By.name("submit")).click();
	}
	
	@AfterTest
	public void endSession(){
		driver.close();
	}

}
