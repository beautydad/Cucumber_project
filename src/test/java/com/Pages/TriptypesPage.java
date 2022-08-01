package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Browserfactory;

public class TriptypesPage extends Browserfactory {
	
	//Create a constructor
	public TriptypesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	//Locate the Triptypes link
	@FindBy(xpath="//*[@id='primary-menu']/li[2]/a")
	WebElement Trip_Types;
	
	//Click on the Triptypes 
	public void Click_Trip_() {
		Trip_Types.click();
	}

}
