package Alerts_PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ALert_ex {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\archana\\git\\Chandan_Shalab_Automation\\Chandan_Shalab_Automation\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/js_alerts_prompts_and_confirmations/");
		
		
		WebElement click_alert = driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/p[2]/a"));
		
		click_alert.click();
		
		
		
		Alert alrt = driver.switchTo().alert();
		
		String text = alrt.getText();
		System.out.println(text);
		//Thread.sleep(3000);
		alrt.accept();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
