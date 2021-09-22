package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text_ex {

	public static void main(String[] args) throws InterruptedException 
	{
		//Specify type of browser and path of dricer
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/Chandan_Shalab_Automation/Chandan_Shalab_Automation/Browser_Drivers/chromedriver");
	
		//Launching Empty Browser
		WebDriver driver = new ChromeDriver();

		//Navigating to Test Url
		driver.get("https://softwaretestingexperts.com/");
		
		Thread.sleep(1000);
		
		WebElement course_btn = driver.findElement(By.xpath("/html/body/div/main/header/div[2]/nav/ul/li[3]/div/a"));
		
		String  Course_btn_name = course_btn.getText();
		
    	System.out.println(Course_btn_name);
    	
    	course_btn.click();

		
		
    	WebElement First_Name =  driver.findElement(By.xpath("/html/body/div/main/section[1]/div[2]/div[2]/div/form/div[1]/div[1]/div/input"));
		
		First_Name.sendKeys("Girish");
		Thread.sleep(3000);
		First_Name.clear();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
