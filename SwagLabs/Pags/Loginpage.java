package com.SwagLabs.Pags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{
	
	//Encapsulation= data+ getter/setter function
	
	private WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//WebElement
	
	private By username=By.name("user-name");
	
	private By Password=By.name("password");
	
	private By btn=By.id("login-button");
	
	//business logic
	
	public void doLogin(String un, String psw)
	{
		driver.findElement(username).sendKeys(un);
		
		driver.findElement(Password).sendKeys(psw);
		
		driver.findElement(btn).click();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


