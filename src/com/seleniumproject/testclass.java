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
public class testclass {



	static WebDriver driver1 = new ChromeDriver ();
	public static void main(String[] args)  {
		driver1.get("https://magento.softwaretestingboard.com/");
		driver1.manage().window().maximize();	 
		driver1.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		driver1.findElement( By.xpath("//input[@id='email']")).sendKeys("vigneshn1@gmail.com");
		driver1.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")).sendKeys("vignesh12345!");
		driver1.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();
		action();
		
		
	}
	
	
		
		//Action		
			 public static void action () {
				 WebElement Men = driver1.findElement(By.xpath("(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[4]"));
				 Actions action = new Actions(driver1);
				 action.moveToElement(Men).build().perform();
				 action.contextClick(Men).build().perform();
				 //driver1.findElement(By.xpath("//a[@id='ui-id-5']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")).click();
				 driver1.findElement(By.xpath("(//span[contains(text(),'Hoodies & Sweatshirts')])[2]")).click();
	}
//			 public static void robot () throws AWTException {
//				 Robot robot = new Robot() ;
//				 robot.keyPress(KeyEvent.VK_DOWN);
//				 robot.keyRelease(KeyEvent.VK_DOWN);
//				 robot.keyPress(KeyEvent.VK_ENTER);	 
			 
				 
}


//			(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[4]