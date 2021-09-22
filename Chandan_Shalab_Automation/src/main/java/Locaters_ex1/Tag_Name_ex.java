package Locaters_ex1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Name_ex {

	public static void main(String[] args) throws InterruptedException 
	{
		//Specify type of browser and path of dricer
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
			
				//Launching Empty Browser
				WebDriver driver = new ChromeDriver();

				//Navigating to Test Url
				driver.get("https://softwaretestingexperts.com/");
				
				Thread.sleep(1000);
				
				
				 List<WebElement> alllinks = driver.findElements(By.tagName("a"));
			        
			        for(WebElement link:alllinks )
			        {
			        	System.out.println(link.getAttribute("href"));
			        }
	}

}
