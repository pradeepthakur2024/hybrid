package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("WebDriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://www.instagram.com");
		Thread.sleep(5000);

	}
	

}
