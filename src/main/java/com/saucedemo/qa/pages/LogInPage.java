package com.saucedemo.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.qa.base.TestBase;

public class LogInPage extends TestBase {
	
	WebDriver driverLP;
	
	//Pagefactory - Object Repo
	By txtUsername= By.id("user-name");
	By txtPassword= By.id("password");
	By loginbtn= By.id("login-button");

	//@FindBy(xpath="//div[@class='login_logo']")WebElement loginLego;
	
//	@FindBy(xpath="//div[contains(@class,'error-message-container ')]")WebElement sadfaceerrormessage;

	//How to initialize pagefactory?Through PageFactory.initElements
	
	public LogInPage (WebDriver driverc) {
		this.driverLP=driverc;
	
		
	}
	
	//Actions
	public void enterUserName(String uname) {
		driver.findElement(txtUsername).sendKeys(uname);
	}
	public void enterUserPassword(String pwd) {
		driver.findElement(txtPassword).sendKeys(pwd);
	}
	public void clickloginButton() {
		driver.findElement(loginbtn).click();
	}
	/*public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean validateloginLego() {
		return loginLego.isDisplayed();
	}
	
	public HomePage login(String uname,String pwd) {
		userName.sendKeys(uname);
		password.sendKeys(pwd);
		loginbutton.click();
		
		return new HomePage();
	}

	*/
}
