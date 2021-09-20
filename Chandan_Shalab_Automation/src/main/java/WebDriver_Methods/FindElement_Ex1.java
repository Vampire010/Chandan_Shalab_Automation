package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Introduction.Browser_Launcher;

public class FindElement_Ex1 {

	public static void main(String[] args) throws InterruptedException
	{
		//Specify type of browser and path of dricer
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/eclipse-workspace/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
	
		//Launching Empty Browser
		WebDriver driver = new ChromeDriver();

		//Navigating to Test Url
		driver.get("https://softwaretestingexperts.com/");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/main/header/div[2]/nav/ul/li[3]/div/a")).click();
			
	}
}
