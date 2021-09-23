package WebElement_Methods;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		//Specify type of browser and path of dricer
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
			
				//Launching Empty Browser
				WebDriver driver = new ChromeDriver();

				//Navigating to Test Url
				driver.get("https://www.google.com/");
				
				Thread.sleep(1000);
				
		        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        
		        Files.copy(scrFile, new File("/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/ScreenShots/image.png"));

				driver.quit();
		    	
		    
	}

}
