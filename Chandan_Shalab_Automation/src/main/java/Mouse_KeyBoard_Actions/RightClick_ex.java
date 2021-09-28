package Mouse_KeyBoard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_ex {

	public static void main(String[] args) throws InterruptedException 
	{
		//Specify type of browser and path of dricer
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
	
		//Launching Empty Browser
		WebDriver driver = new ChromeDriver();

		//Navigating to Test Url
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		


		WebElement Rht_Click = driver.findElement(By.name("q"));
		
		//Dbl_Click.click();
		Actions act = new Actions(driver);
		
		act.contextClick(Rht_Click).perform();
		
		
	}

}
