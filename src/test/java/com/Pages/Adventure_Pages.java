package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Browserfactory;

public class Adventure_Pages {
	
	//Create a global variable
	public WebDriver driver;
	
	//Create a construtor 
	public Adventure_Pages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	// Locate the Triptype link
	@FindBy(xpath="//*[@id='primary-menu']/li[2]/a")
	WebElement Trip_Types;
	
	//Locate the Adventure link
	
	@FindBy(className="btn-more")
	WebElement Adventure;
	
	//Locate the view details buttton
	@FindBy(xpath="//*[@id='wp-travel-trip-wrapper']/div/div/div[3]/div[1]/div/div[3]/a")
	WebElement View_Details;
	
	//Click on the trip type link
	public void Click_Trip_() {
		Trip_Types.click();
	}
	
	// Click on the Adventure link
	public void Click1_Adventure() {
		Adventure.click();

	}
	//Click on the  View_details
	public void Click_View_Details() {
		View_Details.click();
	}

}
