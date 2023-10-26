package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjectRepoLib.DemoBlazeHome;
import genericLibrary.WebDrivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definitions {

	public static WebDriver driver;
	static DemoBlazeHome open; 

	@Given("Open browser")
	public void open_browser()  
	{

		driver = WebDrivers.getBrowser();	
	}
	@When("launch Url")
	public void launch_url()  throws Exception {


		open = PageFactory.initElements(driver, DemoBlazeHome.class);
		open.homePage(driver);

	}
	@Then("Verify title")
	public void verify_title() 
	{

		open.VerifyTitle();

	}
	@When("Login to account")
	public void login_to_account()
	{

		open.LogIn();    
	}

	@Then("Verify greetings")
	public void verify_greetings()
	{
		open.VerifyGreetings();	  
	}

	@Then("Logout app")
	public void logout_app() 
	{

		open.LogOut();
	}
	@When("Select laptop")
	public void select_laptop() 
	{

		open.carting();
	}

	@Then("order macbookpro")
	public void order_macbookpro() 
	{
		

	}
	@Then("verify cart")
	public void verify_cart() 
	{
		open.verifyCart();
	}
}
