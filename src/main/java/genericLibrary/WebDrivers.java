package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDrivers {
	

	public static WebDriver driver;

	public static WebDriver getBrowser() {
		
		if(Constants.Browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/shankari/Downloads/chromedriver-mac-arm64/chromedriver");
			
			driver=new ChromeDriver();
			
		} 
		else if (Constants.Browser.equalsIgnoreCase("safari"))
		{
		 driver=new SafariDriver();
		 
		} 
		
		return driver;
	}
}
