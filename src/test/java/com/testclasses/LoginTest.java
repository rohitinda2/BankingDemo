package com.testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.LoginPom;

public class LoginTest extends BaseClass {
    LoginPom loginPom;

    @BeforeClass
    public void setUp() throws Exception {
        loginPom = new LoginPom();
        launchTheWeb();
    }

    @Test
    public void loginTest() {
    	System.out.println("UserName "+loginPom.getUsername());
        loginPom.setUsernameAdmin(loginPom.getUsername());
        loginPom.setPasswordAdmin(loginPom.getpassword());
        loginPom.clickOnButton();
    }
    
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}