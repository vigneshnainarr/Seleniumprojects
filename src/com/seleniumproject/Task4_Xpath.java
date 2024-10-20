package com.seleniumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// XPath, wait, findElements
public class Task4_Xpath {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// wait - implicitly
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement element = driver.findElement(By.linkText("Create new account"));
		element.click();
		driver.findElement(By.name("firstname")).sendKeys("Mark");
		driver.findElement(By.name("lastname")).sendKeys("Zuckerberg");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("9876543210");
		WebElement year = driver.findElement(By.xpath("//option[@value='2004']"));
		year.click();
		WebElement male = driver.findElement(By.xpath("//input[@type='radio'][@value='2']"));
		male.click();
		WebElement SignUp = driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
		// wait - explicit
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(SignUp));
		SignUp.click();
		// findElements
		List<WebElement> list = driver.findElements(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg'][2]"));
		for (WebElement month : list) {
			String text = month.getText();
			System.out.println(text);
		}
		}
	}




