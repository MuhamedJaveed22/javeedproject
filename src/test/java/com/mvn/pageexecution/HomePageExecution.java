package com.mvn.pageexecution;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mvn.basepack.BaseClass;
import com.mvn.pagefactory.AmzLoginPage;
import com.mvn.pagefactory.HomePage;

public class HomePageExecution {
	
	@Before
	public void launchingBrowser() {
		BaseClass.browserLaunch();
	}
	@After
	public void out() {
		BaseClass.close();
	}
	@Test
	public void openFaceBookPage() throws IOException {
		BaseClass.loadUrl(BaseClass.readProperty("facebookUrl"));
		HomePage Hp = new HomePage();
		BaseClass.searchElementById(Hp.userName).sendKeys(BaseClass.readProperty("userName"));
		BaseClass.searchElementById(Hp.passWord).sendKeys(BaseClass.readProperty("passWord"));
		BaseClass.searchElementByXpath(Hp.loginBtn).click();
	}
	
	@Test
	public void amazonLoginWithCredential() throws IOException {
	BaseClass.browserLaunch();
	BaseClass.loadUrl(BaseClass.readProperty("amazonUrl"));
	AmzLoginPage al = new AmzLoginPage();
	BaseClass.searchElementByXpath(al.signIn).click();
	BaseClass.searchElementByXpath(al.email).sendKeys(BaseClass.readProperty("phoneNumber"));
	BaseClass.searchElementById(al.emailClick).click();
	BaseClass.searchElementByXpath(al.passWord).sendKeys(BaseClass.readProperty("amzPassWord"));
	BaseClass.searchElementById(al.finalClick).click();
}
}

