package WebDriver_Methods;

import Introduction.Browser_Launcher;

public class Test_Class 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		String Browser_Types = "edge";
		String url = "https://softwaretestingexperts.com/";
		
		Browser_Launcher br = new Browser_Launcher();
		br.browser(Browser_Types, url);
		
		Thread.sleep(2000);
		
		br.driver.quit();
		
	}

}
