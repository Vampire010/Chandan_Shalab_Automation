package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Chrome_Browser
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/eclipse-workspace/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingexperts.com/");
	}

}
