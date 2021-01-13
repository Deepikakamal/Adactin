package com.automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement sigin_Btn;
    public HomePage(WebDriver driver2)
    {
    	this.driver=driver2;
    	PageFactory.initElements(driver, this);
    }
	public WebElement getSigin_Btn() {
		return sigin_Btn;
	}
	

}
