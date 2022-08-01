package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Browserfactory;

public class Check_availabilityPage extends Browserfactory{
	
	//create a construtor
	public Check_availabilityPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Locate the trip types
	@FindBy(xpath="(//a[@aria-current='page'])[1]" )
	WebElement Trip_Types;
	
	//Locate the Adventure
	@FindBy(className="btn-more")
	WebElement Adventure;
	
	//Locate the view details
	@FindBy(xpath="//*[@id='wp-travel-trip-wrapper']/div/div/div[3]/div[1]/div/div[3]/a")
	WebElement View_Details;
	
	//Locate the check availability
	@FindBy(xpath="//*[@id='open-booking-modal']")
	WebElement Check_available;
	
	//Locate the date and Month
	@FindBy(xpath="//*[@id='wte-booking-datetime-content']/div/div/div[2]/div[2]/div/div[2]/div/span[33]")
	WebElement date_and_month;
	
	//Locate the Continue button
	@FindBy(xpath="//button[text()='Continue']")
	WebElement continue_Button;
	
	//Locate the Adult 
	@FindBy(className="next wte-up")
	WebElement Adult;
	
	//Locate the Child
	@FindBy(className="next wte-up")
	WebElement child;
	
	//Locate the checkout Button
	@FindBy(xpath="//*[@id='wteProcessNext']")
	WebElement Checkout;
	
	//Click on the trip types link
	public void Click_Trip_() {
		Trip_Types.click();
	}
	
	//Click on the Adventure link
	public void Click_Adventure() {
		Adventure.click();

	}

	//Click on the View Details
	public void Click_View_Details() {
		View_Details.click();
	}

	//Click on the Available button
	public void Click_available() {
		Check_available.click();

	}
	
	// Click on the data
	public void click_data() {
		
		date_and_month.click();
	}
	
//Click on the Continue Button
public void Click_Continue() {
	continue_Button.click();
	

}


//Click on the Adult
public void click_adult() {
	
	Adult.click();
}

//Click on the child
public void click_child() {
	child.click();
}
//Click on the checkout button
public void click_checkout() {
	
	Checkout.click();
}
}
