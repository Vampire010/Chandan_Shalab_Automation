package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) throws InterruptedException
	{
		//Specify type of browser and path of dricer
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
	
		//Launching Empty Browser
		WebDriver driver = new ChromeDriver();

		//Navigating to Test Url
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		
		WebElement course_btn = driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]"));
		
    	
    	System.out.println(" Coordinates " + course_btn.getLocation());
    	
		driver.quit();
	}

}
