package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99ProjectClass {

	ChromeDriver driver;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Lakshmy-softwares\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/v4/");
		
	}
	
	public void login(String userID, String passwd) {
		WebElement userId = driver.findElement(By.name("uid"));
		userId.sendKeys(userID);
		driver.findElement(By.name("password")).sendKeys(passwd);
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
