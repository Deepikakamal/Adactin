package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public static WebDriver driver;
@FindBy(xpath = "//input[@id='email']")
private WebElement email;
@FindBy(xpath = "//input[@id='passwd']")
private WebElement password;
@FindBy(xpath ="//button[@id='SubmitLogin']")
private WebElement submit;
public LoginPage(WebDriver driver2)
{
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public static WebDriver getDriver() {
	return driver;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSubmit() {
	return submit;
}
}
