package Locaters_ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLass_Name_ex3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
		
		//Launching Empty Browser
		WebDriver driver = new ChromeDriver();

		//Navigating to Test Url
		driver.get("https://login.yahoo.com/?YY=28789&order=down&sort=date&pos=0&.src=ym");
		
		Thread.sleep(2000);
		driver.findElement(By.className("phone-no")).sendKeys("SoftwareTestingXperts");

	}

}
