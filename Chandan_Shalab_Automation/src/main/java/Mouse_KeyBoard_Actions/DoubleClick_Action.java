package Mouse_KeyBoard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick_Action {

	public static void main(String[] args) throws InterruptedException 
	{
		//Specify type of browser and path of dricer
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
			
				//Launching Empty Browser
				WebDriver driver = new ChromeDriver();

				//Navigating to Test Url
				driver.get("file:///Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/src/main/java/WebPages/DoubleClick.html");
				
				Thread.sleep(1000);
				


				WebElement Dbl_Click = driver.findElement(By.xpath("/html/body/p[1]"));
				
				//Dbl_Click.click();
				Actions act = new Actions(driver);
				
				act.doubleClick(Dbl_Click).perform();
				
				
	}

}
