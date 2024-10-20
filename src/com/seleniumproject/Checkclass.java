//package com.seleniumproject;
//
//public class Checkclass {
//
//	package com.IPT_practice;
//	import java.io.File;
//	import java.io.IOException;
//	import java.time.Duration;
//
//	import javax.imageio.ImageIO;
//	import org.openqa.selenium.WebDriver;
//	// import org.openqa.selenium.firefox.FirefoxDriver;
//	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.openqa.selenium.support.ui.WebDriverWait;
//
//	import ru.yandex.qatools.ashot.AShot;
//	import ru.yandex.qatools.ashot.Screenshot;
//	import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
//
//	public class Screenshot_shot {
//
//		public static void main(String[] args) throws IOException {
//			WebDriver driver = new ChromeDriver ();
//			
//			driver.manage().window().maximize();
//			driver.get("https://www.amazon.in/");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//			
//			Screenshot take = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);		
//			ImageIO.write(take.getImage(), "PNG", new File(System.getProperty("user.dir") + "\\fullScreenshot\\Amazonfullpage.png"));
//
//		}
//
//	
//
//
//	}


