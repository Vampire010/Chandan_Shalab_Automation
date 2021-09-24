package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enble_ex {

	public static void main(String[] args) throws InterruptedException 
	{
		//Specify type of browser and path of dricer
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
			
				//Launching Empty Browser
				WebDriver driver = new ChromeDriver();

				//Navigating to Test Url
				driver.get("file:///Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/src/main/java/HTML_Pages/Enble.html");
				
				Thread.sleep(1000);
				
				WebElement fname = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
				System.out.println(" is First Name Enabled :  " + fname.isEnabled());
		    	
		    	
		    	WebElement lname = driver.findElement(By.xpath("//*[@id=\"lname\"]"));	
		    	System.out.println(" is Last Name Enabled : " + lname.isEnabled());
		    	
		    	
		    	WebElement submit_btn = driver.findElement(By.xpath("/html/body/form/input[3]"));	
		    	System.out.println(" issubmit_btn Enabled : " + submit_btn.isEnabled());
		    	
		    	
				driver.quit();
	}

}
