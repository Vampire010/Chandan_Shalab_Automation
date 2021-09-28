package Mouse_KeyBoard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Actions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Specify type of browser and path of dricer
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
			
				//Launching Empty Browser
				WebDriver driver = new ChromeDriver();

				//Navigating to Test Url
				driver.get("file:///Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/src/main/java/HTML_Pages/Enble.html");
				
				Thread.sleep(1000);
				


				WebElement First_Name = driver.findElement(By.name("fname"));
				

				WebElement Pet_Name = driver.findElement(By.name("PetName"));
				
				
				
				First_Name.sendKeys("Girish");
				
			/*	//in Windows Operating System
				First_Name.sendKeys(Keys.CONTROL,"A");
				First_Name.sendKeys(Keys.CONTROL,"C");
				Pet_Name.sendKeys(Keys.CONTROL,"V"); */


				//in Mac Operating System
				First_Name.sendKeys(Keys.COMMAND,"A");
				First_Name.sendKeys(Keys.COMMAND,"C");
				Pet_Name.sendKeys(Keys.COMMAND,"V");
				

				
		
	}

}
