package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
         driver.get("http://selenium.dev");
         Thread.sleep(2000);
         
         //scroll down
         
         JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000");
	
		//scroll up
		
		jse.executeScript("window.scrollBy(0,-1000");
		
	}

}
