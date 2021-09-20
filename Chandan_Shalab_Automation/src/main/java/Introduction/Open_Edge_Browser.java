package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Open_Edge_Browser {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "/Users/girishg/eclipse-workspace/Chandan_Shalab_Automation/Browser_Drivers/msedgedriver");
		WebDriver driver = new EdgeDriver();
		driver.get("https://softwaretestingexperts.com/");
	}

}
