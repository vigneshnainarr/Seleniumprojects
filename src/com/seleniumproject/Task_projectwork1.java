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

public class Task_projectwork1 {
// 	static WebDriver driver = new ChromeDriver ();
	static WebDriver driver1 = new ChromeDriver ();
	
//Action		
	 public static void action () {
		 WebElement Men = driver1.findElement(By.xpath("//a[@id='ui-id-3']"));
		 Actions action = new Actions(driver1);
		 action.moveToElement(Men).build().perform();
		 action.contextClick(Men).build().perform();
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
		 String parent = driver1.getWindowHandle();
		 System.out.println(parent);
		 WebDriverWait wait = new WebDriverWait(driver1,Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		 Set<String> AllTabs = driver1.getWindowHandles();
		 System.out.println(AllTabs);
		 for(String Child : AllTabs )
		 	if (!parent.equalsIgnoreCase(Child)) {
		 	driver1.switchTo().window(Child);
		 	System.out.println("Tab Switched");
		 	}
		 	}
 /*  public static void main(String[] args) {
  	 WebDriver driver1 = new ChromeDriver ();
	 driver.get("https://magento.softwaretestingboard.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click(); 
	 driver.findElement(By.id("firstname")).sendKeys("VIGNESH");
	 driver.findElement(By.id("lastname")).sendKeys("N");
	 driver.findElement(By.name("email")).sendKeys("vigneshn1@gmail.com");
	 driver.findElement(By.name("password")).sendKeys("vignesh12345!");
	 driver.findElement(By.name("password_confirmation")).sendKeys("vignesh12345!");
	 driver.findElement(By.xpath(" //button[@title='Create an Account']")).click();
//	 driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")).click();
 * 		close();
	}
		*/
	 public static void main(String[] args) throws AWTException {
		 driver1.get("https://magento.softwaretestingboard.com/");
		 driver1.manage().window().maximize();
		 driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver1.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		 driver1.findElement(By.name("login[username]")).sendKeys("vigneshn1@gmail.com");
		 driver1.findElement(By.name("login[password]")).sendKeys("vignesh12345!");
		 driver1.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();
		 driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver1.findElement(By.xpath("//a/span[text()='Men']")).click();
		 driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver1.findElement(By.xpath("//a[contains(text(),'Hoodies & Sweatshirts')]")).click();
		 
		 
//		 action();
//		 robot();
//		 window(); 
		 
		//	 /html[1]/body[1]/div[2]/main[1]/div[4]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]
		//span[@xpath='1']		//a[@id='ui-id-20']//span[contains(text(),'Hoodies & Sweatshirts')]
		//a[@class='ui-corner-all ui-state-focus']//a[text()='Hoodies & Sweatshirts']
		 //input[@id='email']				//ul/li/ul/li/a/span[text()='Hoodies & Sweatshirts'][1]
		// 'ui-id-20'				//span[normalize-space()='Men']
		 
	 }
}

//		(//span[contains(text(),'Hoodies & Sweatshirts')])[1]
//a/span[text()='Men']

//  //a[@text='Create an Account']
// //ul/lia[@href='https://magento.softwaretestingboard.com/customer/account/create/'][1]
// (//a[normalize-space()='Create an Account'])[1]
//	(//ul[@class='header links']//a)[3]
//	//div[@class='panel header']//a[normalize-space()='Create an Account']
//span[@xpath='1']
//ul/li/a[@xpath='1']
//ul/li/a[@text='Create an Account']