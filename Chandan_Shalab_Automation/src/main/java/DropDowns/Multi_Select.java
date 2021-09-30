package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\archana\\git\\Chandan_Shalab_Automation\\Chandan_Shalab_Automation\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/archana/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/src/main/java/HTML_Pages/Multi_Select_Dropdwn.html");
		
		
		WebElement Drop_down = driver.findElement(By.xpath("/html/body/form/select"));
		
		
		Select Amzn_Drpdwn = new Select(Drop_down);
		
		
		Amzn_Drpdwn.selectByValue("Arcn Blk Bear");
		Amzn_Drpdwn.selectByIndex(2);
		Amzn_Drpdwn.selectByVisibleText("Sun Bear");
		
		Thread.sleep(3000);

		// Deselect
	/*	Amzn_Drpdwn.deselectByIndex(2);
		Amzn_Drpdwn.deselectByValue("Arcn Blk Bear");
		Amzn_Drpdwn.deselectByVisibleText("Sun Bear"); */
		
		
		Amzn_Drpdwn.deselectAll();
		
		//Thread.sleep(3000);
		//driver.quit();
	}

}
