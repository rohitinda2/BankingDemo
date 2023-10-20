package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPom extends BaseClass {
	public LoginPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Username : Admin']")
	private WebElement username;

	@FindBy(xpath = "//*[text()='Password : admin123']")
	private WebElement password;

	@FindBy(xpath = "//*[@name='username']")
	private WebElement inputusername;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement inputpassword;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//*[text()= 'Forgot your password? ']")
	private WebElement forgotPassword;

	public String getUsername() {
		String uname = username.getText();
		return uname.substring(uname.indexOf(':'), uname.length() - 1);
	}

	public String getPassword() {
		String pass = password.getText();
		return pass.substring(pass.indexOf(':'));
	}

	public void clickOnButton() {
		submit.click();
	}

	public void setInputUsername(String setUsername) {
		inputusername.sendKeys(setUsername);
	}

	public void setInputPassword(String setPassword) {
		inputpassword.sendKeys(setPassword);
	}

}













