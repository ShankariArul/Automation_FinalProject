package PageObjectRepoLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLibrary.Constants;
import genericLibrary.WebDriverCommonLib;

public class DemoBlazeHome {

	static WebDriver driver;
	
	static WebDriverCommonLib  object = new WebDriverCommonLib();

	
@FindBy (linkText ="Laptops")
private WebElement laptops;

@FindBy (xpath="//a[contains(text(),'MacBook Pro')]")
private WebElement macbookpro;

@FindBy (css ="a.btn.btn-success")
private WebElement addToCart;

@FindBy (id="cartur")
private WebElement cart;

@FindBy (xpath ="//td[contains(text(),'MacBook Pro')]")
private WebElement cartItem;	

@FindBy (id="login2")
private WebElement login;

@FindBy (id="loginusername")
private WebElement Logusername;

@FindBy (id="loginpassword")
private WebElement Logpassword;

@FindBy (xpath="//button[@onclick='logIn()']")
private WebElement LogInBtn;

@FindBy (partialLinkText="Welcome")
private WebElement Greetingmsg;

@FindBy (linkText="Log out")
private WebElement LogOutBtn;


public void homePage(WebDriver driver) throws Exception
	{
	    
		object.openUrl(Constants.baseurl);
		
		object.enlargeWindow();
		
		object.waitForPageLoad();
		
	}
public void VerifyTitle ()
{
		
		if (object.readTitle().equals("STORE"))
		{
			System.out.println("DemoBlaze website is launched");
		}
		else
		{
			System.out.println("DemoBlaze website is not launched");
		}
		
	}

public void carting () 
{
	laptops.click();
	
	macbookpro.click();
	
	addToCart.click();
	
	System.out.println("Mac Book pro is added to cart");
}

public void verifyCart()
{
	cart.click();
	
	if (cartItem.isDisplayed())
	{
		System.out.println("Mac book pro is displayed in cart");
	} else
	{
		System.out.println("Mac book pro is not displayed in cart");
	}
	
}

public void LogIn ()
{
		
		login.click();
		
		Logusername.sendKeys("admin");
		
		Logpassword.sendKeys("admin");
		
		LogInBtn.click();
		
		System.out.println("User has logged In");
}

public void VerifyGreetings ()
{
		if (Greetingmsg.isDisplayed())
		{
			System.out.println("Welcome message is displayed for the user");
		}
}
public void LogOut ()
{
		LogOutBtn.click();
		
		System.out.println("User has logged Out");
}
}
