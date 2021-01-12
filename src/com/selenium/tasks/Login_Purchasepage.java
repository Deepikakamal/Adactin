package com.selenium.tasks;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login_Purchasepage {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement Sign_in = driver.findElement(By.xpath("//a[@class='login']"));
		Sign_in.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
		WebElement Email_id = driver.findElement(By.xpath("//input[@id='email']"));
        Email_id.sendKeys("drop2deepika@gmail.com");
        
        WebElement Password = driver.findElement(By.xpath("//input[@id='passwd']"));
        Password.sendKeys("ABCDEF123");
        
        WebElement Submit_login = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
        Submit_login.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        Actions A1 = new Actions(driver);
        A1.moveToElement(driver.findElement(By.xpath("//a[@title='Women']"))).build().perform();
        Thread.sleep(2000);
        
        WebElement Evening_dress = driver.findElement(By.xpath("//a[text()='Evening Dresses']"));
        Evening_dress.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        WebElement Quick_view = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
        Quick_view.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.switchTo().frame(0);//as we have only one frame,index is given as 0
        WebElement Inc_quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
        Inc_quantity.click();
        Thread.sleep(2000);
        
        WebElement Size = driver.findElement(By.xpath("//select[@id='group_1']"));
        Select S1 = new Select(Size);
        S1.selectByIndex(2);
        
        WebElement Dress_color = driver.findElement(By.xpath("//a[@id='color_24']"));
        Dress_color.click();
        
        WebElement Cart_btn = driver.findElement(By.xpath("//button[@name='Submit']"));
        Cart_btn.click();
        Thread.sleep(2000);
        
        WebElement Close_window = driver.findElement(By.xpath("//span[@class='cross']"));
        Close_window.click();
        Thread.sleep(2000);
        
        A1.click(driver.findElement(By.xpath("//a[@title='View my shopping cart']"))).build().perform();
        Thread.sleep(2000);
        
        WebElement Checkout = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
        Checkout.click();
        Thread.sleep(2000);
        
        WebElement Checkout2 = driver.findElement(By.xpath("//button[@name='processAddress']"));
        Checkout2.click();
        Thread.sleep(2000);
        
        WebElement Checkboxx = driver.findElement(By.xpath("//input[@type='checkbox']"));
        Checkboxx.click();
        Thread.sleep(2000);
        
        WebElement Checkout3 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
        Checkout3.click();
        Thread.sleep(2000);
        
        WebElement Payment_bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
        Payment_bank.click();
        Thread.sleep(2000);
        
        WebElement Confirm_order = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
        Confirm_order.click();
        Thread.sleep(2000);
        
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\deepi\\Selenium_Concepts\\Snapshots\\Order5.PNG");
        FileUtils.copyFile(source, destination);
        Thread.sleep(2000);
        
         A1.moveToElement(driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"))).build().perform();
         WebElement Summer_dresses = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[2]"));
         Summer_dresses.click();
         Thread.sleep(2000);
         
         WebElement Quick_view1 = driver.findElement(By.xpath("//img[@title='Printed Summer Dress']"));
         Quick_view1.click();
         Thread.sleep(2000);
         
         //driver.switchTo().frame(0);
         WebElement Plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
         A1.click(Plus).build().perform();
         Thread.sleep(2000);
         
         WebElement Size1 = driver.findElement(By.xpath("//select[@id='group_1']"));
         Select S2 = new Select(Size1);
         S2.selectByIndex(2);
         Thread.sleep(2000);
         
         WebElement Color = driver.findElement(By.xpath("//a[@id='color_11']"));
         Color.click();
         Thread.sleep(2000);
         
         WebElement Wishlist = driver.findElement(By.xpath("//a[@title='Add to my wishlist']"));
         Wishlist.click();
         Thread.sleep(2000);
         
         WebElement AddToCart = driver.findElement(By.xpath("//button[@name='Submit']"));
         AddToCart.click();
         Thread.sleep(2000);
         
         WebElement Close1 = driver.findElement(By.xpath("//a[@title='Close']"));
         Close1.click();
         Thread.sleep(2000);
         
         WebElement Checkoutt = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
         Checkoutt.click();
         Thread.sleep(2000);
         
         WebElement Checkout4 = driver.findElement(By.xpath("///a[@class='button btn btn-default standard-checkout button-medium']"));
         Checkout4.click();
         Thread.sleep(2000);
         
         WebElement Checkboxx1 = driver.findElement(By.xpath("//button[@name='processAddress']"));
         Checkboxx1.click();
         Thread.sleep(2000);
         
         WebElement Checkout5 = driver.findElement(By.xpath("//input[@name='cgv']"));
         Checkout5.click();
         Thread.sleep(2000);
         
         WebElement Checkout6 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
         Checkout6.click();
         Thread.sleep(2000);
         
         WebElement Payment_cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
         Payment_cheque.click();
         Thread.sleep(2000);
         
         WebElement Confirm_order1 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
         Confirm_order1.click();
         Thread.sleep(2000);
         
	}

}
