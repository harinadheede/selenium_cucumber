package stepDefinition;

import pages.FlightReservation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	FlightReservation fResrv = new FlightReservation();
	
	
	@Given("^User launch the browser$")
	public void User_is_on_Home_Page() throws Throwable {
		fResrv.intialize_Browser();
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    
		fResrv.launch_Url();
	}
	
	@When("^Select source and destination from excel$")
	public void select_source_and_destination_from_excel() throws Throwable {
	    
	    fResrv.selectSourceandDestination();
	}
	
	@Then("^select the cheapest and fastest flight and close the browser$")
	public void select_the_cheapest_and_fastest_flight_and_close_the_browser() throws Throwable {
	    
	    fResrv.chooseFlight();
	    fResrv.close_browser();
	}
}
