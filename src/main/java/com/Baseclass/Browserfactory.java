package com.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserfactory {
	protected WebDriver driver;
public	Properties property;
	InputStream input;
	protected Logger logger;
	public void Launch() throws IOException {
		property =new Properties();
		try {
		input=new FileInputStream("src/test/resources/ConfigProperty/travel.property");
		try {
			property.load(input);
		}
		catch (IOException e) {
			e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		logger = Logger.getLogger(Browserfactory.class);
		PropertyConfigurator.configure("src/test/resources/Log4j2Properties/log4j.properties");
		
		logger.info("******************Starting with Browser Set Up************************");
		String browser = property.getProperty("browser");
		String url = property.getProperty("url");
		System.out.println("url::::::"+url);
		
		switch (browser.toLowerCase()) {

		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		logger.info(String.format("Identified the browser as %s. Launching the browser", browser));
		break;

		case "ie":
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		logger.info(String.format("Identified the browser as %s. Launching the browser", browser));
		break;
		case "headlessbrowser":
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver=new ChromeDriver(options);

		default:
		logger.info(String.format("Could not identify the browser as %s. Please specify correct browser", browser));
		break;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		logger.info("Launched the cucumber Application");
		
		
	}
	
	public  void closeapp() {
		driver.close();
		logger.info("Launched the cucumber Application");

	}
}
