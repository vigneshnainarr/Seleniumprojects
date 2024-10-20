package com.seleniumproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Task7_Action {
		static WebDriver driver = new ChromeDriver ();
		
//Action		
	 public static void action () {
		 WebElement Fresh = driver.findElement(By.xpath("//a[@class='nav-a  '][1]"));
		 Actions action = new Actions(driver);
		 action.moveToElement(Fresh).build().perform();
		 action.contextClick(Fresh).build().perform();
	 }
//Robot
	 public static void robot () throws AWTException {
		 Robot robot = new Robot() ;
		 robot.keyPress(KeyEvent.VK_DOWN);
		 robot.keyRelease(KeyEvent.VK_DOWN);
		 robot.keyPress(KeyEvent.VK_ENTER);
	 }
//window handle	 
	 public static void window () {
		 String parent = driver.getWindowHandle();
		 System.out.println(parent);
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		 Set<String> AllTabs = driver.getWindowHandles();
		 System.out.println(AllTabs);
		 for(String Child : AllTabs )
		 	if (!parent.equalsIgnoreCase(Child)) {
		 	driver.switchTo().window(Child);
		 	System.out.println("Tab Switched");
		 	}
	 }
	public static void main(String[] args) throws AWTException {
		 driver.get("https://www.amazon.in/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.manage().window().maximize();
		 action();
		 robot();
		 window(); 
	}
}


////a[@class='nav-a  '][1]
//a[@id='nav_link_allhealthingress']