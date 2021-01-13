package com.automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressSelection {
	public static WebDriver driver;

	 
     @FindBy(xpath= "//a[@title='Women']")
     private WebElement women;
     @FindBy(xpath= "//a[text()='Evening Dresses']")
     private WebElement eveningdress;
     @FindBy(xpath= "//img[@title='Printed Dress']")
     private WebElement printeddresses;
     @FindBy(xpath= "//i[@class='icon-plus']")
     private WebElement Plus;
     @FindBy(xpath="//select[@id='group_1']")
     private WebElement Size;
     @FindBy(xpath="//a[@id='color_24']")
     private WebElement color;
     @FindBy(xpath="//button[@name='Submit']")
     private WebElement submit_Btn;
     @FindBy(xpath="//span[@class='cross']")
     private WebElement close;
     
   public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getEveningdress() {
		return eveningdress;
	}

	public WebElement getPrinteddresses() {
		return printeddresses;
	}

	public WebElement getPlus() {
		return Plus;
	}

	public WebElement getSize() {
		return Size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getSubmit_Btn() {
		return submit_Btn;
	}

	public WebElement getClose() {
		return close;
	}

public DressSelection(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
		
	}


     
}
