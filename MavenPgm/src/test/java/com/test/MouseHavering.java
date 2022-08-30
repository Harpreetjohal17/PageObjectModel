package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHavering extends Setup{
	
	@Test
	public void Hovering() throws InterruptedException
	{
		
		
	WebElement accountlist =	driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	
	Actions act  = new Actions(driver);
	
	act.moveToElement(accountlist).perform();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Account']")).click();
	}

}
