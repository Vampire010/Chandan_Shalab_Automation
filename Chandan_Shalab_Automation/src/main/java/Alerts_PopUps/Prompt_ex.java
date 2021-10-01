package Alerts_PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_ex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\archana\\git\\Chandan_Shalab_Automation\\Chandan_Shalab_Automation\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/archana/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/src/main/java/HTML_Pages/prompt_popup.html");
		
		
		WebElement click_alert = driver.findElement(By.xpath("/html/body/button"));
		click_alert.click();

		Alert alrt = driver.switchTo().alert();
		
		alrt.sendKeys("B");
		Thread.sleep(3000);

		//alrt.accept();
		alrt.dismiss();
		Thread.sleep(4000);
		driver.quit();
	}

}
