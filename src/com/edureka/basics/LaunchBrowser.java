package com.edureka.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	ChromeDriver driver;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Lakshmy-softwares\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http:/facebook.com");
		
	}
	
	public void navigateBrowser() {
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public void closeBrowser() {
		driver.close();
	}
}
