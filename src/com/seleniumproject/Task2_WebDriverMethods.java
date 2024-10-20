package com.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Task2_WebDriverMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();	
	driver.get("https://www.amazon.in/");
	System.out.println("1. opened page 1");
	driver.get("https://www.flipkart.com/");
	System.out.println("2. opened page 2");
	driver.manage().window().minimize();
	System.out.println("3. page 2 minimize");
	driver.manage().window().fullscreen();
	System.out.println("4. page 2 full screen ");
	driver.manage ().window().maximize();
	String currentUrl = driver.getCurrentUrl();
	System.out.println("5. page 2 Url is " + currentUrl);
	//String PageSource = driver.getPageSource();
	//System.out.println("14. page 2 source code is " +PageSource);
	String Title = driver.getTitle();
	System.out.println("6. page 2 Title is " +Title);
	//driver.getWindowHandle();
	//driver.getWindowHandles();
	//driver.manage().window().setPosition(null);
	//driver.manage().window().setSize(null);
	driver.navigate().to("https://www.youtube.com/");
	System.out.println("7. opened page 3");
	driver.navigate().back();
	System.out.println("8. back to page 2");
	driver.navigate().forward();
	System.out.println("9. forward to page 3");
	driver.navigate().refresh();
	System.out.println("10. refresh page 3");
	//driver.close();
	//System.out.println("11. close page 3");
	driver.quit();
	System.out.println("12. browser closed");
	System.out.println("13. Test Done");
	}

}
