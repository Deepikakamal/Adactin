package com.automation.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.pom.DressSelection;
import com.automation.pom.HomePage;
import com.automation.pom.Initial_Checkout;
import com.automation.pom.LoginPage;

public class Shoppingwith_Baseclass extends Base_class {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		driver = getDriver("chrome");

		getUrl("http://automationpractice.com/index.php");
		HomePage home = new HomePage(driver);
		clickElement(home.getSigin_Btn());
		sleep(2000);
		LoginPage login = new LoginPage(driver);
		inputValueElement(login.getEmail(), "drop2deepika@gmail.com");
		inputValueElement(login.getPassword(), "ABCDEF123");
		clickElement(login.getSubmit());
		sleep(2000);
		
		DressSelection sel = new DressSelection(driver);
	    moveToElement(sel.getWomen());
		sleep(2000);
		clickElement(sel.getEveningdress());
		frameConcepts(sel.getPrinteddresses(), "0", null, null);
		clickElement(sel.getPrinteddresses());
		doubleClick(sel.getPlus());
		sleep(2000);
		clickElement(sel.getSize());
		clickElement(sel.getColor());
		clickElement(sel.getSubmit_Btn());
		sleep(2000);
		Initial_Checkout ic = new Initial_Checkout(driver);
		clickElement(ic.getProceed_checkout1());
		clickElement(ic.getProceed_Checkout2());
		sleep(2000);
		clickElement(ic.getCheckbox1());
		clickElement(ic.getProceed_Checkout3());
		clickElement(ic.getBankWire());
		clickElement(ic.getConfirm_Order());
		
		
		
	}
}
