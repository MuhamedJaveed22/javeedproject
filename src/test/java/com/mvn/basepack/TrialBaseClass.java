package com.mvn.basepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrialBaseClass {
public static WebDriver driver;

public static void launch() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
public static void urlLoad (String url) {
	driver.get(url);
}
public static WebElement searchElementByXpath(String Xpath) {
	return driver.findElement(By.xpath(Xpath));
}
public static WebElement searchElementById(String id) {
	return driver.findElement(By.id(id));
}
//Property read:
	public static String propertyRead(String key) throws IOException {
	File fi = new File("C:\\Users\\Muhamed Javeed\\eclipse-workspace"
			+ "\\MavenMarProject\\src\\test\\resources\\Data\\data.properties");
	FileInputStream fis = new FileInputStream(fi);
	Properties prop = new Properties();
	prop.load(fis);
	return prop.getProperty(key);
}
}
