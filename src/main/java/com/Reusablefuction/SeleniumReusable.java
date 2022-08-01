package com.Reusablefuction;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Browserfactory;

public class SeleniumReusable extends Browserfactory {
	
	public SeleniumReusable(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void To_Take_Screenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(source, new File(path));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void get_Title() 
	{
		System.out.println(driver.getTitle());
		
	}
	
	public void get_Current_url() 
	{
		System.out.println(driver.getCurrentUrl());
	}
	
	
public void Threadwait() throws InterruptedException {
	Thread.sleep(10000);

}

}