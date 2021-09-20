package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Firefox_Browser 
{


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/Users/girishg/eclipse-workspace/Chandan_Shalab_Automation/Browser_Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://softwaretestingexperts.com/");
	}

}
