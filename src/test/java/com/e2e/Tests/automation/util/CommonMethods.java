package com.e2e.Tests.automation.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMethods {
	public CommonMethods() {
		driver = Setup.driver; // pour relier le driver de la classe Common avec le driver de la class Setup :
								// singleton (rendre mon projet basé sur un seul driver : un seul chauffeur)
	}

	public static WebDriver driver;
	public static Properties prop;
	
	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class); // import de slf4j

	public void scrollerBottom() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
	}

	public void scrollerTop() {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollTo(" + 0 + "," + 0 + ")", "");
	}

	public void readFromConfigFile(String url) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src\\test\\resources\\configs\\config.properties");
		prop.load(fis);
		driver.get(prop.getProperty(url));
	}

}
