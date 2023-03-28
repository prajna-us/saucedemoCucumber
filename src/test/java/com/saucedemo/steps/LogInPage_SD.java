package com.saucedemo.steps;

import org.openqa.selenium.WebDriver;

import com.saucedemo.qa.base.TestBase;
import com.saucedemo.qa.pages.LogInPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogInPage_SD extends TestBase {
	WebDriver driver=null;;
	LogInPage loginpage;
	TestBase tb;

@Given("user is in login page")
public void user_is_in_login_page() {
	TestBase tb=new TestBase();
	tb.intialization();


	
}

@And ("user enters valid {string} and {string}")
public void user_enters_valid_username_and_password(String uname,String pwd) {
  loginpage=new LogInPage(driver);
   loginpage.enterUserName(uname);
   loginpage.enterUserPassword(pwd);
}

@Given("user enter valid password {string}")
public void user_enter_password(String pwd) {
    loginpage.enterUserPassword(pwd);
}

@Then("user clicks on login button")
public void user_clicks_on_login_button() {
    loginpage.clickloginButton();
}


	
}
