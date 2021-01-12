package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Initial_Checkout {
	public static WebDriver driver;

	 
    @FindBy(xpath= "//a[@class='btn btn-default button button-medium']")
    private WebElement Proceed_checkout1;
    @FindBy(xpath= "//a[@class='button btn btn-default standard-checkout button-medium']")
    private WebElement Proceed_Checkout2;
    @FindBy(xpath= "//input[@type='checkbox']")
    private WebElement Checkbox1;
    @FindBy(xpath= "//button[@name='processCarrier']")
    private WebElement Proceed_Checkout3;
    @FindBy(xpath= "//a[@class='bankwire']")
    private WebElement BankWire;
    @FindBy(xpath= "//button[@class='button btn btn-default button-medium']")
    private WebElement Confirm_Order;
    
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getProceed_checkout1() {
		return Proceed_checkout1;
	}
	public WebElement getProceed_Checkout2() {
		return Proceed_Checkout2;
	}
	public WebElement getCheckbox1() {
		return Checkbox1;
	}
	public WebElement getProceed_Checkout3() {
		return Proceed_Checkout3;
	}
	public WebElement getBankWire() {
		return BankWire;
	}
	public WebElement getConfirm_Order() {
		return Confirm_Order;
	}

   
	public Initial_Checkout(WebDriver driver2) {
		this .driver=driver2;
		PageFactory.initElements(driver, this);
	}}
