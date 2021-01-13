package com.selenium.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_WindowsHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("google ceo images");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement image = driver.findElement(By.xpath("//div[@class='fWhgmd']"));
		
		Actions a1 = new Actions(driver);
		a1.contextClick(image).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Set<String> all_Id= driver.getWindowHandles();
	    for(String id : all_Id)
	 {
	    	String title = driver.switchTo().window(id).getTitle();
	    	System.out.println(title);
	 }
	   String actual_Title = "google ceo images - Google Search";
	   for(String id : all_Id)
	   {
		   if(driver.switchTo().window(id).getTitle().equals(actual_Title))
		   {
			   
			   break;
		   }

	   }
	   Thread.sleep(2000);
	   driver.close();
	   }
}
