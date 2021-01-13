package com.selenium.concepts;

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

public class WindowsHandling_Concepts{
	public static void main(String[] args) throws AWTException,InterruptedException{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	WebElement account = driver.findElement(By.xpath("//span[text() ='Account & Lists']"));
	Actions a = new Actions(driver);
	a.contextClick(account).build().perform();
	Thread.sleep(2000);
    Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement gift_Cards = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
	a.contextClick(gift_Cards).build().perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement best_Sellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
	a.contextClick(best_Sellers).build().perform();
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
   String actual_Title = "Gift Cards & Vouchers Online : Buy Gift Vouchers & E Gift Cards Online in India - Amazon.in";
   for(String id : all_Id)
   {
	   if(driver.switchTo().window(id).getTitle().equals(actual_Title))
	   {
		   break;
		   
	   }

}
   driver.close();
   }}
    	
