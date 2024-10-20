package com.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1_BrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new FirefoxDriver();
		WebDriver driver3 = new EdgeDriver();
		driver1.get("https://www.youtube.com/");
		//driver1.close();
		driver2.get("https://www.flipkart.com/");
		//driver2.close();
		driver3.get("https://www.amazon.in/");
		//driver3.close();
		driver3.quit();
		driver2.quit();
		driver1.quit();
	}

}
