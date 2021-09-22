package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_method {

	public static void main(String[] args) throws InterruptedException
	{
		//Specify type of browser and path of dricer
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
	
		//Launching Empty Browser
		WebDriver driver = new ChromeDriver();

		//Navigating to Test Url
		driver.navigate().to("https://parabank.parasoft.com/");
		
		
		
		driver.findElement(By.partialLinkText("Regi")).click();
		
		Thread.sleep(3000);

		driver.navigate().back();
		
		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);
		
		driver.navigate().refresh();

		Thread.sleep(3000);
		
		


		driver.quit();
		
	}

}
