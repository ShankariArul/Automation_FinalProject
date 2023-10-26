package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverCommonLib {

	public static WebDriver driver = WebDrivers.driver;

	static Alert alert;

	WebElement element;

	public void openUrl(String url) 
	{
		driver.get(url);
	}
	public String readTitle() 
	{
		return driver.getTitle();
	}
	public void enlargeWindow()
	{
		driver.manage().window().maximize();
	}
	public void waitForPageLoad()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.globalwait));
	}
	public static WebElement locateElement (By Locator)
	{
		WebElement element = driver.findElement(Locator);

		return element;
	}
	public void displayedText()
	{	

		element.isDisplayed();
	}
	public void enterData(By Locator, String Text)
	{
		WebElement element = driver.findElement(Locator);
		
		element.sendKeys(Text);
	}
	public Alert switchToAlert() 
	{
		alert = driver.switchTo().alert();

		return alert;
	}
	public void acceptAlert()
	{
		alert.accept();
	}
	public void closeWindow() 
	{
		driver.close();
	}	
}
