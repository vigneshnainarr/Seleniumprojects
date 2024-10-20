package com.seleniumproject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Task5_Capture_Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//Takes Screenshot by FileHandler
		TakesScreenshot Screenshot = (TakesScreenshot) driver;
		File source = Screenshot.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\vicky\\eclipse-workspace\\Seleniumprojects\\sseclipse\\handler.png");
		FileHandler.copy(source, desti);
//Takes Screenshot by FileUtils	
		TakesScreenshot Screenshot1 = (TakesScreenshot) driver;
		File source1 = Screenshot1.getScreenshotAs(OutputType.FILE);
		File desti1 = new File("C:\\Users\\vicky\\eclipse-workspace\\Seleniumprojects\\sseclipse\\util.png");
		FileUtils.copyFile(source1, desti1);
		driver.quit();	
	}
}



/*
 * TakesScreenshot ts = (TakesScreenshot) driver; 
 * File source = ts.getScreenshotAs(OutputType.FILE);
 * File desti1 = new File("C:\\Users\\vicky\\eclipse-workspace\\Seleniumprojects\\sseclipse\\util.png");
	FileUtils.copyFile(source1, desti1);
 * 
 */


/*
 * File sssource = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 * File ssdestination = new File("./sshot/img1.png"); FileHandler.copy(sssource,
 * ssdestination);
 * 
 * WebElement logo = driver.findElement(By.id("nav-logo-sprites")); File
 * sssourcelogo = ((TakesScreenshot) logo).getScreenshotAs(OutputType.FILE);
 * File ssdestlogo = new File("./sshot/img2.png");
 * FileHandler.copy(sssourcelogo, ssdestlogo);
 * 
 * WebElement btm = driver.findElement(By.
 * xpath("//div[@class='navFooterVerticalColumn navAccessibility']")); File
 * sssourcebtm = ((TakesScreenshot) btm).getScreenshotAs(OutputType.FILE); File
 * ssdestbtm = new File("./sshot/img3.png"); FileHandler.copy(sssourcebtm,
 * ssdestbtm); driver.quit();
 */