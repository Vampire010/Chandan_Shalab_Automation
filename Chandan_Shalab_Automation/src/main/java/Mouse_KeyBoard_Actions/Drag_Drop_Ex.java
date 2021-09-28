package Mouse_KeyBoard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Ex {

	public static void main(String[] args) throws InterruptedException 
	{

		//Specify type of browser and path of dricer
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
	
		//Launching Empty Browser
		WebDriver driver = new ChromeDriver();

		//Navigating to Test Url
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(1000);
		

		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		
		driver.manage().window().fullscreen();

		
		WebElement src_drag = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a"));
		
		WebElement dst_drop = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));

		
		//Dbl_Click.click();
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src_drag, dst_drop).perform();
		
		
	}

}
