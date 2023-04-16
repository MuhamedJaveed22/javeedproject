package com.mvn.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mvn.basepack.BaseClass;

public class AdacLoginPage extends BaseClass  {
public AdacLoginPage () {  //Constructor
	PageFactory.initElements(driver, this);
}

@FindBy (xpath = "//input[@type='text']")
public WebElement userName;

@FindBy (xpath = "//input[@type='password']")
public WebElement passWordAdac;

@FindBy (xpath = "//input[@type='Submit']")
public WebElement press;
}
