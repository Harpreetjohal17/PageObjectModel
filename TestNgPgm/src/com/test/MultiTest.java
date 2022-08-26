package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiTest {
	WebDriver driver;
	
	@BeforeClass
	public void Initalization()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\parde\\Desktop\\SeleniumJars\\geckodriver.exe");
//		
		 driver = new ChromeDriver(); //runtime polymorhism
		
	//	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void SelectDropDown()
	{
		
		
	WebElement seldrop = 	driver.findElement(By.id("searchDropdownBox"));
	
	Select sel = new Select(seldrop);
	
	sel.selectByIndex(4);
	
	//sel.selectByValue("search-alias=baby-products");
	
	//sel.selectByVisibleText("CDs & Vinyl");
	//driver.close();
	
	
	}

	@Test(dependsOnMethods = "SelectDropDown")
	public void AdvanceDropDown()
	{
		
		
	WebElement seldrop = 	driver.findElement(By.id("searchDropdownBox"));
	
	Select sel = new Select(seldrop);
	List<WebElement> li = sel.getOptions();
	System.out.println(li.size());
	
	for(int i = 0 ; i<li.size() ; i++) // 0 0<=57
	{
		
		li.get(i).click();
		System.out.println(li.get(i).getText());//[alldep to whole foo].get(0)
	}
	
	

	for(int i= li.size()-1; i>=0; i--)
	{
		li.get(i).click();
		System.out.println(li.get(i).getText()); // whole food to all department
	}
	
	//driver.close();
	}
	
	@AfterClass
	public void Cleanup()
	{
		driver.close();
	}
	
}
