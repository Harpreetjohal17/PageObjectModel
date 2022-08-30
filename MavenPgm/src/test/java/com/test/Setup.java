package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Setup {
	
	WebDriver driver;
	
	@BeforeClass
	public void initalization()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver(); //runtime polymorhism
		
		//	WebDriver driver = new FirefoxDriver();
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void cleanUp()
	{
		driver.close();
	}

}
