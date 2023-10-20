package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	FileInputStream fis;
	public static String projectPath=System.getProperty("user.dir");
	public WebDriver driver;

	public void launchTheWeb() throws FileNotFoundException  {
		fis=new FileInputStream(projectPath+"\\src\\main\\resources\\property\\config.properties");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties properties = new Properties();
		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		properties.getProperty("weburl");
		driver.get(properties.getProperty("weburl"));
	}

}