package stepDefinition;

import pages.HomePage;
import pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	LoginPage loginpage= new LoginPage();
	HomePage homepage= new HomePage();
	
	
	@Given("^User launch the browser$")
	public void User_is_on_Home_Page() throws Throwable {
	   loginpage.launch_Browser();
	}

	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page() throws Throwable {
	    loginpage.navigateTo_LoginPage();
	}

	@When("^User enters UserName and Password$")
	public void User_enters_UserName_and_Password() throws Throwable {
		loginpage.set_txt_UserName("mercury");
		loginpage.set_txt_Password("mercury");
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void User_enters_UserName_and_Password(String userName,String password) throws Throwable {
		System.out.println(userName+" - "+password);
		loginpage.set_txt_UserName(userName);
		loginpage.set_txt_Password(password);
		loginpage.click_SignIn();
	}
	
	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable {
	    homepage.verify_Login_Message();
	}

	@When("^User LogOut from the Application$")
	public void User_LogOut_from_the_Application() throws Throwable {
		homepage.logout();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void Message_displayed_LogOut_Successfully() throws Throwable {
		homepage.logout();
	}
	
}
