package SynChronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Ex {

	public static void main(String[] args) throws InterruptedException 
	{
		//Specify type of browser and path of dricer
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
	
		//Launching Empty Browser
		WebDriver driver = new ChromeDriver();

		//Navigating to Test Url
		driver.get("https://www.irctc.co.in/");
		
		Thread.sleep(1000);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("statedropdown")));
		
		
		

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")));
		
		WebElement Alert_Box = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button"));
		
		Alert_Box.click();
		
	
	}

}
