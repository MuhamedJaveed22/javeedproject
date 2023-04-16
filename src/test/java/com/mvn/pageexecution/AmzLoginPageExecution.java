package com.mvn.pageexecution;

import java.io.IOException;
import com.mvn.basepack.BaseClass;
import com.mvn.pagefactory.AmzLoginPage;

public class AmzLoginPageExecution {
	public static void main(String[] args) throws IOException {
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
