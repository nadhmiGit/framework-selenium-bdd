package com.e2e.Tests.automation.util;

public class InternetExplorerDriver extends DriverManager {

	@Override
	protected void startService() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "src/test/resources/BrowserDriver/IEDriverServer.exe");
	}

	@Override
	protected void stopService() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createDriver() {
		// TODO Auto-generated method stub
		// driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

}
