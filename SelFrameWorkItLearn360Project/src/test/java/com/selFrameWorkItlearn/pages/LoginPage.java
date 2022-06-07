package com.selFrameWorkItlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
public LoginPage(WebDriver ldriver)
{
	this.driver=ldriver;
}

@FindBy(id="loginlabel") WebElement loginButton;
@FindBy(id="user_login") WebElement userName;
@FindBy(id="user_pass") WebElement passWord;
@FindBy(id="wp-submit") WebElement submit;

public void loginDetails(String Uname,String Pwd)
{
	loginButton.click();
	userName.sendKeys(Uname);
	passWord.sendKeys(Pwd);
	submit.click();
	
	
}


}
