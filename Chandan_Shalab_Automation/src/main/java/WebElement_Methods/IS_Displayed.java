package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IS_Displayed {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
		
		//Launching Empty Browser
		WebDriver driver = new ChromeDriver();

		//Navigating to Test Url
		driver.get("https://www.softwaretestingexperts.com/");
		
		Thread.sleep(1000);
		
		WebElement contact_lnk = driver.findElement(By.xpath("//*[@id=\"app\"]/main/header/div[2]/nav/ul/li[3]/div/a/a"));
		
    	
    	boolean is_disp = contact_lnk.isDisplayed();
    	
    	
		System.out.print(is_disp);
    
    	
		driver.quit();
	}

}
