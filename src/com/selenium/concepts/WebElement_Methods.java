package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\deepi\\Selenium_Concepts\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	boolean enabled = email.isEnabled();
	System.out.println(enabled);
	email.sendKeys("Swetha123@gamil.com");
	Thread.sleep(4000);
	email.clear();
	email.sendKeys("Deepika123@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("ABCD");
	WebElement Login_Btn = driver.findElement(By.xpath("//button[@name='login']"));
	Login_Btn.click();
	String attribute = email.getAttribute("value");
	System.out.println(attribute);
	String attribute2 = email.getAttribute("id");
	System.out.println(attribute2);
}
}
