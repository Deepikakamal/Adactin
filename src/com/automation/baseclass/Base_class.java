package com.automation.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {

	public static WebDriver driver;

	public static WebDriver getDriver(String browser)// browser is a element
	{
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("\\Driver\\IEdriverServer.exe"));
				driver = new InternetExplorerDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
				driver = new FirefoxDriver();

			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		} catch (Exception e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}

		return driver;
	}

	public static void clickElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getcurrentUrl() {
      driver.getCurrentUrl();
	}

	public static void getUrl(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void close() {
		driver.close();
	}

	public static void navigate_To(String URL) {
		driver.navigate().to(URL);
	}
	public static void navigate_Back() {
        driver.navigate().back();
	}
	public static void navigate_Forward() {
     driver.navigate().forward();
	}
	public static void navigate_Refresh() {
     driver.navigate().refresh();
	}
	
	public static void dragAndDrop(WebElement source, WebElement target) {
	
	Actions a = new Actions(driver);
	
	a.dragAndDrop(source, target).build().perform();
	}
	public static void contextClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	public static void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}
	
	public static void sleep(int seconds) throws Throwable {
		Thread.sleep(seconds);
	}

	public static void waitConcepts(String type, int Duration, TimeUnit format, WebElement element) {
		try {
			if (type.equalsIgnoreCase("implicit")) {
				driver.manage().timeouts().implicitlyWait(Duration, format);
			} else if (type.equalsIgnoreCase("explicit")) {
				WebDriverWait wait = new WebDriverWait(driver, Duration);
				wait.until(ExpectedConditions.visibilityOf(element));

			} else if (type.equalsIgnoreCase("Fluent Wait")) {
				Wait wait1 = new FluentWait(driver).withTimeout(Duration, format).ignoring(Exception.class);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
public static  void robot_concepts(WebElement element) throws Throwable
{
Actions a = new Actions(driver);
a.contextClick(element).build().perform();
Thread.sleep(2000);
Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
	
r.keyPress(KeyEvent.VK_UP);
r.keyRelease(KeyEvent.VK_UP);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
	
}
public static void contextClick1(WebElement element)
{
	Actions a = new Actions(driver);
	a.contextClick(element).build().perform();
}
public static void doubleClick1(WebElement element)
{
	Actions a = new Actions(driver);
	a.doubleClick(element).build().perform();
}
public static void moveToElement(WebElement element)
{
	Actions a = new Actions(driver);
	a.moveToElement(element).build().perform();
}
public static void Click1(WebElement element)
{
	Actions a = new Actions(driver);
	a.click(element).build().perform();
}

public static void frameConcepts(WebElement element, String value, String id,String type) {
try {
	if(type.equalsIgnoreCase("index"))
	{
		int parseInt = Integer.parseInt(value);
		driver.switchTo().frame(parseInt);
	}
	else if(type.equalsIgnoreCase("id"))
	{
		driver.switchTo().frame(id);
	}
	else if(type.equalsIgnoreCase("webElement"))
	{
		driver.switchTo().frame(element);
	}
} catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}


public static void simple_Alert() {
	driver.switchTo().alert().accept();
	driver.switchTo().defaultContent();
}

public static void confirm_Alerts(String ok , String cancel)
{
	if(ok.equalsIgnoreCase("ok"))
	{
driver.switchTo().alert().accept();
driver.switchTo().defaultContent();
}
	else if(cancel.equalsIgnoreCase("cancel"))
	{
		driver.switchTo().alert().dismiss();
		driver.switchTo().defaultContent();
	}
}

public static void prompt_Alerts(String ok, String cancel, String text ) {
if(ok.equalsIgnoreCase("ok")) {
	driver.switchTo().alert().sendKeys(text);
	driver.switchTo().alert().accept();
	driver.switchTo().defaultContent();
}
else if(cancel.equalsIgnoreCase("cancel"))
{
	driver.switchTo().alert().sendKeys(text);
	driver.switchTo().alert().dismiss();
	driver.switchTo().defaultContent();
}
}
public static void windowshandlings(String type, String destination) {
if(type.equalsIgnoreCase("single window"))
{
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
}
else if(type.equalsIgnoreCase("multiple Window"))
{
	Set<String> windowHandles = driver.getWindowHandles();
	for (String window : windowHandles) {
	System.out.println(window);
	String title = driver.switchTo().window(window).getTitle();
	System.out.println(title);
	}
	String actualTitle = destination;
	for (String string : windowHandles) {
		if(driver.switchTo().window(string).getTitle().equalsIgnoreCase(actualTitle));
		break;
	}
		
	}
	
}

public static void drop_down(String type,String value,WebElement element) {
Select s = new Select(element);
if(type.equalsIgnoreCase("byIndex"))
{
	int index=Integer.parseInt(value);
	s.selectByIndex(index);
	
}
else if(type.equalsIgnoreCase("byValue"))
{
s.selectByValue(value);
}
else if(type.equalsIgnoreCase("byVisibleText"))
{
s.selectByVisibleText(value);
}}

public static void Mutlipledrop_down(String type,String value,WebElement element) {
Select s = new Select(element);
if(type.equalsIgnoreCase("byIndex"))
{
	int index=Integer.parseInt(value);
	s.selectByIndex(index);
	
}
else if(type.equalsIgnoreCase("byValue"))
{
s.selectByValue(value);
}
else if(type.equalsIgnoreCase("byVisibleText"))
{
s.selectByVisibleText(value);
}}


public static void Snap_shot(String path) throws Throwable {
	TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    File destination = new File(path);
    FileUtils.copyFile(source, destination);
}
}
