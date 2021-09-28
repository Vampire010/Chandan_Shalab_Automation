package Mouse_KeyBoard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoer_Actions {

	public static void main(String[] args) throws InterruptedException {
		//Specify type of browser and path of dricer
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
			
				//Launching Empty Browser
				WebDriver driver = new ChromeDriver();

				//Navigating to Test Url
				driver.get("https://www.snapdeal.com/");
				
				Thread.sleep(1000);
		

				
				driver.manage().window().fullscreen();

				
				WebElement All_Offers = driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]/a/span[2]"));
				
				WebElement Ac_Blankets = driver.findElement(By.xpath("/html/body/div[10]/div[3]/div/div[1]/div[2]/ul/li[1]/div/div[1]/div/div/p[2]/a/span"));

				Thread.sleep(2000);

				//Dbl_Click.click();
				Actions act = new Actions(driver);
				act.moveToElement(All_Offers).perform();
				
				Thread.sleep(3000);

				Ac_Blankets.click();
				
				Thread.sleep(3000);

				driver.quit();
				
				
	}

}
