package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepi\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
//		driver.manage().window().maximize();
//		List<WebElement> row_data = driver.findElements(By.xpath("//table//tbody/tr[3]/td"));
//		for (WebElement rows : row_data) {
//			String text = rows.getText();
//			System.out.println(text);
//			List<WebElement> column_data = driver.findElements(By.xpath("//table//tbody/tr/td[2]"));
//			for (WebElement column : column_data) {
//				String text1 = column.getText();
//				System.out.println(text1);
//				}
				List<WebElement> Headings = driver.findElements(By.xpath("//table/thead"));
				for (WebElement Table_Headings : Headings) {
					String text2 = Table_Headings.getText();
					System.out.println(text2);
					List<WebElement> column_headings = driver.findElements(By.xpath("//table/tbody//tr//th"));
					for (WebElement Col_Headings : column_headings) {
						String text3 = Col_Headings.getText();
						System.out.print(text3 + " ");
					}
				}
			}
		}

//}