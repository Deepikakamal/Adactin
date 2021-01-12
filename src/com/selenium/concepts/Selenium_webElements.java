package com.selenium.concepts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_webElements {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepi\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ABC@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("ABC");
		WebElement login_Btn = driver.findElement(By.name("login"));
		login_Btn.click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\deepi\\Selenium_Concepts\\Snapshots\\facebooksnap.png");
        FileUtils.copyFile(source, destination);
        driver.quit();	
	}
	

}
