package com.mvn.pageexecution;

import java.io.IOException;

import com.mvn.basepack.BaseClass;
import com.mvn.pagefactory.AdacLoginPage;

public class AdacPageExecution {
public static void main(String[] args) throws IOException {
	BaseClass.browserLaunch();
	BaseClass.loadUrl(BaseClass.readProperty("adactinUrl"));
	AdacLoginPage alp = new AdacLoginPage ();
	alp.userName.sendKeys(BaseClass.readProperty("userName"));
	alp.passWordAdac.sendKeys(BaseClass.readProperty("passWord"));
	alp.press.click();
}
}
