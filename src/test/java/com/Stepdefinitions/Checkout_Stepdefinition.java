package com.Stepdefinitions;

import java.io.IOException;

import com.Baseclass.Browserfactory;
import com.Pages.Check_availabilityPage;
import com.Reusablefuction.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout_Stepdefinition extends Browserfactory {
	Check_availabilityPage ca;
	 SeleniumReusable sel;

	 
	 @Given("Lauch the travel application")
	 public void lauch_the_travel_application() throws IOException {
		 Launch();
		 logger.info("******************Launched  the Trave Application************************");
	 }

		
	 @When("click  Triptype link")
	 public void click_Triptype_link() throws InterruptedException {
			/*
			 * ca=new Check_availabilityPage(driver); sel.Threadwait(); //ca.Click_Trip_();
			 */		 logger.info("******************Clicked on the TripTypes************************");
	 }

	@When("click on the Adventure link")
	public void click_on_the_Adventure_link() {
	   // ca.Click_Adventure();
	    logger.info("******************Clicked on the Adventure ************************");
	}

	@When("Click on the view details")
	public void click_on_the_view_details() throws InterruptedException {
		//ca.Click_View_Details();
		sel =new SeleniumReusable(driver);
		logger.info("******************Clicked on View Detais ************************");
	  
	}

	@When("click on the CheckAvailability")
	public void click_on_the_CheckAvailability() throws InterruptedException {
		 sel.Threadwait();
		//ca.Click_available();
		logger.info("******************Clicked on Check Availability************************");
	}

	@When("Select date and clcik on continue button")
	public void select_date_and_clcik_on_continue_button() throws InterruptedException {
	   // ca.click_data();
	    //ca.Click_Continue();
	    
	    logger.info("******************Clicked on Continue Button ************************");
	    
	}

	@When("Select adult and Child option")
	public void select_adult_and_Child_option() throws InterruptedException {
		//sel.Threadwait();
	 //  ca.click_adult();
	   
	  // sel.Threadwait();
	   //ca.click_child();
	}

	@When("click on proceed to checkout button")
	public void click_on_proceed_to_checkout_button() {
	    //ca.click_checkout();
	}

	@Then("It should navigate to the WP travel engine  checkout page")
	public void it_should_navigate_to_the_WP_travel_engine_checkout_page() {
	   
	    sel.To_Take_Screenshot("src/test/resources/Screenshots/checkout.png");
	    sel.get_Current_url();
	    sel.get_Title();
	   closeapp();
	   logger.info("******************Took screenshot ************************");
	   logger.info("******************Print the Url ************************");
	   logger.info("****************** Print the title ************************");
	}

}
