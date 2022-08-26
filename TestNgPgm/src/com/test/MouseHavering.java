package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHavering {
	
	@BeforeTest
	public void setup()
	{
		System.out.println("beforetest");
	}
	
	
	@Test
	public void Hovering() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\parde\\Desktop\\SeleniumJars\\geckodriver.exe");
//		
		WebDriver driver = new ChromeDriver(); //runtime polymorhism
		
	//	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
	WebElement accountlist =	driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	
	Actions act  = new Actions(driver);
	
	act.moveToElement(accountlist).perform();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Account']")).click();
	}
	@AfterTest
	public void close()
	{
		System.out.println("aftertest");
	}

}
