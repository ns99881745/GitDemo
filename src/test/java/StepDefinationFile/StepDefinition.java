package StepDefinationFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	
	
	@Given("User is on landing Page")
	public void user_is_on_landing_page()
	{
		
		
		System.out.println("user is on landing page");
		
	}
	
	@When("User enter username and password")
	public void User_enter_username_and_password()
	{
		System.out.println("username and password");
		
		
	}
	
	@Then("User is redirected to Home Page")
	public void User_is_redirected_to_Home_Page()
	{
		
		System.out.println("user is on Home Page");
	}
	
	
	 @And("^cards are displaying on cards$")
	    public void cards_are_displaying_on_cards()  {
	        
		 System.out.println("Cards are displaying");
	    }

	
	
	
	
	
	
	
	
	
	
	
	
	
}
