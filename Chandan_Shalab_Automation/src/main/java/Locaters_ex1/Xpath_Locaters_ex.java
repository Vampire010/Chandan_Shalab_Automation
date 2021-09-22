package Locaters_ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Locaters_ex {

	public static void main(String[] args) throws InterruptedException 
	{
		//Specify type of browser and path of dricer
		System.setProperty("webdriver.gecko.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/geckodriver");
	
		//Launching Empty Browser
		WebDriver driver = new FirefoxDriver();

		//Navigating to Test Url
		driver.get("https://parabank.parasoft.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Jay007");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input")).sendKeys("ram@1234");

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")).click();

		
	}

}
