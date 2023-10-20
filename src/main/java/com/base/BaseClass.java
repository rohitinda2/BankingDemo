package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	FileInputStream file;
	public static String projectPath = System.getProperty("user.dir");

	public void launchTheWeb() throws FileNotFoundException {
		file = new FileInputStream(projectPath + "\\src\\main\\resources\\property\\config.properties");
		Properties properties = new Properties();
		try {
			properties.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		properties.getProperty("weburl");

		driver.get(properties.getProperty("weburl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
}
