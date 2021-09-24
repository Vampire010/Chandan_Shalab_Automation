package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Sel_ex2 {

	public static void main(String[] args) throws InterruptedException 
	{
		//Specify type of browser and path of dricer
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
			
				//Launching Empty Browser
				WebDriver driver = new ChromeDriver();

				//Navigating to Test Url
				driver.get("file:///Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/src/main/java/HTML_Pages/Selected.html");
				
				
				//gender - Radio Buttons
				WebElement FeMale = driver.findElement(By.xpath("/html/body/form/input[2]"));
				
				
		    	
				Thread.sleep(3000);
				
				if(FeMale.isSelected())
				{
					System.out.println(" Is Male Radio button Selected :  ");
					
				}
				else
				{
					
					FeMale.click();
					System.out.println(" I have Selected in Else cond :  " );

					
				}

				
				
				
				
	}

}
