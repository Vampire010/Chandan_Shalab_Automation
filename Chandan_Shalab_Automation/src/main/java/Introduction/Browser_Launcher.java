package Introduction;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Launcher
{
	public static WebDriver driver ;
	
	
	public String browser(String browser_Type , String URL )
	{
		if(browser_Type.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
			driver = new ChromeDriver();
			driver.get(URL);
		}
		else if(browser_Type.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/geckodriver");
			driver = new FirefoxDriver();
			driver.get(URL);
		}
		
		else if(browser_Type.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/msedgedriver");
			driver = new EdgeDriver();
			driver.get(URL);
		}
		else
		{	
			System.out.print("Given Browser Type is Not Matching");
		}
		
		return URL;
	}

}
