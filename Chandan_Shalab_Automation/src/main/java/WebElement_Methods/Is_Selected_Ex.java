package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected_Ex {

	public static void main(String[] args) throws InterruptedException
	{
		//Specify type of browser and path of dricer
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
	
		//Launching Empty Browser
		WebDriver driver = new ChromeDriver();

		//Navigating to Test Url
		driver.get("file:///Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/src/main/java/HTML_Pages/Selected.html");
		
		Thread.sleep(1000);
		
		//gender - Radio Buttons
		WebElement Male = driver.findElement(By.xpath("/html/body/form/input[1]"));
		System.out.println(" Is Male Radio button Selected :  " + Male.isSelected());
    	
		Thread.sleep(3000);

		
    	WebElement Female = driver.findElement(By.xpath("/html/body/form/input[2]"));	
    	System.out.println(" is Female Radio button Selected : " + Female.isSelected());
		Thread.sleep(3000);

    	Female.click();
    	System.out.println(" is Female Radio button Selected : " + Female.isSelected());

    	
    	
    	//Checkboxes
    	WebElement apple = driver.findElement(By.xpath("/html/body/form/input[4]"));	
    	System.out.println(" is apple Checkbox Selected : " + apple.isSelected());
		Thread.sleep(3000);

    	
    	WebElement Banana = driver.findElement(By.xpath("/html/body/form/input[6]"));	
    	System.out.println(" is Banana Checkbox Selected : " + Banana.isSelected());
		Thread.sleep(3000);

    	Banana.click();
    	System.out.println(" is Banana Checkbox Selected : " + Banana.isSelected());

    	
    	
		Thread.sleep(3000);

		driver.quit();
	}

}
