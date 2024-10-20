package com.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Task6_Javascript_Executor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//JavaScript Executor
		WebElement ele1 = 
		driver.findElement(By.xpath("//a[@href='https://www.aboutamazon.in/?utm_source=gateway&utm_medium=footer']"));
//works		//ele1.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();",ele1);
//works		//js.executeScript("arguments[0].click();",ele1);
	js.executeScript("window.scrollBy(0,1500);");
	}

}

// //div[@class='cN1yYO']//div[@class='Nx9bqj _4b5DiR']
// //div[@class,'Nx9bqj _4b5DiR']

//div[contains(@class,'col col-5-12 BfVC2z']////div[contains(@class,'Nx9bqj _4b5DiR')]
//div[contains(@class,'Nx9bqj _4b5DiR')]