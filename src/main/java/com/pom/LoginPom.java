package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPom extends BaseClass {

	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Username : Admin']")
	private WebElement usernameAdmin;

	@FindBy(xpath = "//*[text()='Password : admin123']")
	private WebElement passwordAdmin;

	@FindBy(xpath = "//*[@name='username']")
	private WebElement username;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//*[text()= 'Forgot your password? ']")
	private WebElement forgotPassword;

	public String getUsername() {
		username.getText();
		return username.getText();
	}

	public String getpassword() {
		return password.getText();
	}

	public void clickOnButton() {
		submit.getText();
	}

	public void setUsernameAdmin(String setusername) {
		usernameAdmin.sendKeys(setusername);
	}

	public void setPasswordAdmin(String setpassword) {
		passwordAdmin.sendKeys(setpassword);
	}

}
