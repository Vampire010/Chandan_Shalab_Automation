package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amzon_Dropdown_ex {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\archana\\git\\Chandan_Shalab_Automation\\Chandan_Shalab_Automation\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		WebElement Drop_down = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[1]/div/div/select"));
		
		
		Select Amzn_Drpdwn = new Select(Drop_down);
		
		//Amzn_Drpdwn.selectByIndex(5);
		
		
		//Amzn_Drpdwn.selectByValue("search-alias=apparel");
		
		Amzn_Drpdwn.selectByVisibleText("Health & Personal Care");
		
		
		WebElement Search_btn = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		Search_btn.click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
