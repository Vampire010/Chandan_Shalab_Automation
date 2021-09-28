package SynChronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impicit_wait_Ex {

	public static void main(String[] args) throws InterruptedException 
	{
		//Specify type of browser and path of dricer
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
			
				//Launching Empty Browser
				WebDriver driver = new ChromeDriver();

				//Navigating to Test Url
				driver.get("https://www.google.com/");
				
				Thread.sleep(1000);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				WebElement Search_Box = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
				Search_Box.sendKeys("Girish");


				WebElement Search_Icon = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[1]/div/span/svg"));
		    	
				Search_Icon.click();
				driver.quit();
	}

}
