package com.Stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Baseclass.Browserfactory;
import com.Pages.Adventure_Pages;
import com.Reusablefuction.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adventure_Stepdefinition extends Browserfactory {
	
	//Create a global varialbe from pages class and selenium reusable class
	Adventure_Pages ap= null;
	SeleniumReusable sel= null;
	
	//
	@Given("Lauch the travel url")
	public void lauch_the_travel_url() throws IOException {
		Launch();
		logger.info("******************Launched  the Trave Application************************");
	}


	    
	@When("click on  Triptype link")
	public void click_on_Triptype_link() {
		ap=new Adventure_Pages(driver);
		sel=new SeleniumReusable(driver);
		ap.Click_Trip_();
		logger.info("******************Clicked on the TripTypes************************");
	}

	@When("Click the Adventure link")
	public void click_the_Adventure_link() {
		ap.Click1_Adventure();
		logger.info("******************Clicked on the Adventure ************************");
	}

	@When("Click view details")
	public void click_view_details() {
		ap.Click_View_Details();
		logger.info("******************Clicked on the view Details************************");
	    
	}

	@Then("It should navigate to the check availability")
	public void it_should_navigate_to_the_check_availability() {
			sel.To_Take_Screenshot("src/test/resources/Screenshots/Adventure.png");
	    closeapp();
	    logger.info("******************Took Screen screenshot ************************");
	    logger.info("******************Close the Travel application************************");
	}

}
