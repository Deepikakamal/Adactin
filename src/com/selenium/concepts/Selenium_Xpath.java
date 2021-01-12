package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\deepi\\Selenium_Concepts\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("ABC@gmail.com");
	WebElement pass = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
	pass.sendKeys("ABC");
	WebElement Sign_btn = driver.findElement(By.xpath("//button[@name='login']"));
	Sign_btn.click();
//    WebElement txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));
//	String text = txt.getText();
//	System.out.println(text);
	driver.navigate().to("http://automationpractice.com/index.php");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	}
}
