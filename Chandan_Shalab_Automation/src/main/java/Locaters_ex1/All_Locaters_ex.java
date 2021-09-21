package Locaters_ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Locaters_ex 
{

	public static void main(String[] args) throws InterruptedException
	{

				//Specify type of browser and path of driver
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
			
				//Launching Empty Browser
				WebDriver driver = new ChromeDriver();

				//Navigating to Test Url
				driver.get("https://parabank.parasoft.com");
				
				Thread.sleep(1000);
				
				//driver.findElement(By.linkText("Register")).click();
				
				driver.findElement(By.partialLinkText("Regi")).click();

				//Inspect Element By ID
				driver.findElement(By.id("customer.firstName")).sendKeys("jay");
				driver.findElement(By.id("customer.lastName")).sendKeys("ram");
				driver.findElement(By.id("customer.address.street")).sendKeys("Temple Street");
				driver.findElement(By.id("customer.address.city")).sendKeys("NewTown");

				
				//Inspect Element By Name
				driver.findElement(By.name("customer.address.state")).sendKeys("Alaska");
				driver.findElement(By.name("customer.address.zipCode")).sendKeys("243151");
				driver.findElement(By.name("customer.phoneNumber")).sendKeys("1025629010");
				
				//Inspect Element By CSS Selector
				driver.findElement(By.cssSelector("#customer\\.ssn")).sendKeys("7382647");
				driver.findElement(By.cssSelector("#customer\\.username")).sendKeys("Jay007");
				driver.findElement(By.cssSelector("#customer\\.password")).sendKeys("ram@1234");

				driver.findElement(By.cssSelector("#repeatedPassword")).sendKeys("ram@1234");
				
				driver.findElement(By.cssSelector("#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input")).click();

				
				
				Thread.sleep(4000);
				driver.quit();
				
				
	}

}
