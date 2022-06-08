package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	static
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
	
ChromeDriver driver=new ChromeDriver();  //open the chrome browser
	driver.get("https://www.EditPlus.com");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.close();
		
	}

}