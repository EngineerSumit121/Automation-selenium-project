package com.SwagLabs.Pags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResetPassword {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
        driver.findElement(By.name("user-name")).sendKeys("locked_out_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.quit();

	}

}
