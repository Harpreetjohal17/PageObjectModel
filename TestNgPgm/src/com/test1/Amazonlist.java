package com.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonlist {
	
	@BeforeSuite
	public void suite()
	{
		System.out.println("suite");
	}
	

	@BeforeTest
	public void setup()
	{
		System.out.println("beforetest");
	}
	

	@Test
	public void amazonHovering() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\parde\\Desktop\\SeleniumJars\\geckodriver.exe");
//		
		WebDriver driver = new ChromeDriver(); // runtime polymorhism

		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		WebElement accountlist = driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
		Actions act = new Actions(driver);

		act.moveToElement(accountlist).perform();
		// List<WebElement> li = driver.findElements(By.xpath("//a[@class='nav-link
		// nav-item']"));
		List<WebElement> li = driver
				.findElements(By.xpath("//div[@class='nav-title']|//a[@class='nav-link nav-item'] "));
		List <WebElement> li1 =driver.findElements(By.xpath("//div[contains(@class,'itemList ')]|//a[@class='nav-link nav-item']"));
		System.out.println(li1.size());

		for (int i = 0; i < li1.size(); i++) {
			System.out.println(li1.get(i).getText());
		}

		// System.out.println(li.size());

	}
	@AfterTest
	public void close()
	{
		System.out.println("aftertest");
	}
	
	@AfterSuite
	public void suite1()
	{
		System.out.println("aftersuite");
	}
	


}
