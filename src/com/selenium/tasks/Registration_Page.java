package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration_Page {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		WebElement Sign_in = driver.findElement(By.xpath("//a[@class='login']"));
		Sign_in.click();
		WebElement Email = driver.findElement(By.xpath("//input[@name='email_create']"));
		Email.sendKeys("drop2deepika@gmail.com");
		WebElement Create_act = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		Create_act.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement Gender_btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("uniform-id_gender2")));
        Gender_btn.click();
        System.out.println("Clicked Mrs");	
		
        WebElement First_name = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		First_name.sendKeys("Deepika");
		
		WebElement Last_name = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		Last_name.sendKeys("Kamal");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='passwd']"));
		Password.sendKeys("ABCDEF123");
		
		WebElement Days = driver.findElement(By.id("days"));
		Select s = new Select(Days);
		s.selectByValue("15");
		
		WebElement Months = driver.findElement(By.name("months"));
		Select s1 = new Select(Months);
		s1.selectByIndex(7);
		
		WebElement Year = driver.findElement(By.id("years"));
		Select s2 = new Select(Year);
		s2.selectByIndex(6);
		
		WebElement Company = driver.findElement(By.xpath("//input[@id='company']"));
		Company.sendKeys("Kekaran Mekaran");
		
		WebElement Address = driver.findElement(By.xpath("//input[@id='address1']"));
		Address.sendKeys("No.1,Vivekandha street,US main road,California:91");
		
		WebElement City = driver.findElement(By.xpath("//input[@id='city']"));
		City.sendKeys("Alaska");
		
		Thread.sleep(2000);
		
		WebElement State = driver.findElement(By.xpath("//select[@id='id_state']"));
	    Select S1 = new Select(State);
	    S1.selectByIndex(4);
	    
	    WebElement Postal_code = driver.findElement(By.xpath("//input[@id='postcode']"));
	    Postal_code.sendKeys("60000");
	    
	    WebElement Country = driver.findElement(By.xpath("//select[@id='id_country']"));
	    Select S2 = new Select(Country);
	    S2.selectByVisibleText("United States");
	    
	    WebElement Additional_info = driver.findElement(By.xpath("//textarea[@id='other']"));
	    Additional_info.sendKeys("Nothing");
	    
	    WebElement Home_phone = driver.findElement(By.xpath("//input[@id='phone']"));
	    Home_phone.sendKeys("1234567890");
	    
	    WebElement Mobile_phone = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
	    Mobile_phone.sendKeys("7307739003");
	  
	    WebElement My_address = driver.findElement(By.xpath("//input[@id='alias']"));
	    My_address.sendKeys("alias");
	    
	    WebElement Register_Btn = driver.findElement(By.xpath("//button[@id='submitAccount']"));
	    Register_Btn.click();
	    
		
	}
	

}
