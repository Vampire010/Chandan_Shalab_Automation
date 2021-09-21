package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Introduction.Browser_Launcher;

public class FindElement_Ex1 {

	public static void main(String[] args) throws InterruptedException
	{
		//Specify type of browser and path of dricer
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
	
		//Launching Empty Browser
		WebDriver driver = new ChromeDriver();

		//Navigating to Test Url
		driver.get("https://softwaretestingexperts.com/");
		
		Thread.sleep(1000);

		
		//click action
		driver.findElement(By.xpath("//*[@id=\"app\"]/main/header/div[2]/nav/ul/li[3]/div/a")).click();
		
		Thread.sleep(2000);
		
		//sendkeys action - which will send the data
		driver.findElement(By.xpath("//*[@id=\"00pDBnuK54kQ-0KB2lwgy\"]/div[2]/div/form/div[1]/div[1]/div/input")).sendKeys("Girish");
				
		Thread.sleep(2000);
		driver.quit();
			
	}
}
