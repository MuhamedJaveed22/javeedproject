package com.mvn.basepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();//maximize
	}
	public static void close() {
		driver.close();
	}
	public static void loadUrl(String url) {
		driver.get(url);		
	}
	public static WebElement searchElementById(String id) {
		return driver.findElement(By.id(id));
	}
	public static WebElement searchElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	//Property file
	public static String readProperty(String key) throws IOException {
		File file = new File("C:\\Users\\Muhamed Javeed\\Downloads\\MavenMarProject\\"
				+ "src\\test\\resources\\Data\\data.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
}

