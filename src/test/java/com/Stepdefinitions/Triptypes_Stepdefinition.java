package com.Stepdefinitions;

import java.io.IOException;

import com.Baseclass.Browserfactory;
import com.Pages.TriptypesPage;
import com.Reusablefuction.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Triptypes_Stepdefinition extends Browserfactory{
	TriptypesPage pg;
	SeleniumReusable re;
	@Given("Lauch  travel url")
	public void lauch_travel_url() throws IOException {
	   Launch();
	   logger.info("******************Launched the Trave application ************************");
	}

	@When("click the Triptype link")
	public void click_the_Triptype_link() throws InterruptedException {
	    pg=new TriptypesPage(driver);
	    re=new SeleniumReusable(driver);
	    re.Threadwait();
	    pg.Click_Trip_();
	    logger.info("******************Clicked on the Trip Types ************************");
	}

	@Then("It should  navigate to the different triptypes page")
	public void it_should_navigate_to_the_different_triptypes_page() {
		
		re.To_Take_Screenshot("src/test/resources/Screenshots/triptypes.png");
		
		logger.info("******************Took Screenshot************************");
	}

	@Then("It should   displays the Adventure triptypes")
	public void it_should_displays_the_Adventure_triptypes() {
		re.get_Current_url();
		re.get_Title();
		closeapp();
		logger.info("******************Print the url ************************");
		logger.info("******************Print the Title ************************");
		logger.info("******************Close the Application ************************");
	    
	}

}
