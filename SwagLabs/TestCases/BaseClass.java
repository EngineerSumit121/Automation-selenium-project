package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pags.*;

public class BaseClass {
	
	public WebDriver driver;
	public Loginpage lp;          //OBJECT CREATE
	
        @BeforeTest()
        
        public void browserSetUp()
        {
         driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://www.saucedemo.com/");
         lp=new Loginpage(driver);
         	
         }
   
        @AfterTest()
        
        	public void tearDown()
        	{
        		driver.quit();
        	}
        	
        }
        
        
