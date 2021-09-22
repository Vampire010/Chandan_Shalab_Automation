package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_quite_ex {

	public static void main(String[] args) throws InterruptedException {
		//Specify type of browser and path of dricer
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
			
				//Launching Empty Browser
				WebDriver driver = new ChromeDriver();

				//Navigating to Test Url
				driver.get("https://www.snapdeal.com/");
				
				Thread.sleep(1000);
				
				WebElement course_btn = driver.findElement(By.xpath("/html/body/div[10]/section/div[4]/section/div[2]/div[1]/div/div[5]/a/div[3]/div[2]"));
				
		    	course_btn.click();
		    	
		    	
		    	
				Thread.sleep(3000);
				
				driver.quit();
				//driver.close();

		    	
	}

}
