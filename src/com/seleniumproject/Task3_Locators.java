package com.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3_Locators {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage ().window().maximize();
		System.out.println("1. opened fb page");
		driver.findElement(By.id("email")).sendKeys("markz");
		System.out.println("2. entered user name");
		driver.findElement(By.id("pass")).sendKeys("passface");
		System.out.println("3. entered pass word");
		WebElement element4 = driver.findElement(By.linkText("Create new account"));
		element4.click();
		System.out.println("4. click to create account");
		driver.quit();
		System.out.println("5. quit driver");
	}

}
