package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
         driver.get("https://www.Ebay.com");
        // Thread.sleep(4000);
         driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Apple Watches");
      	driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
      	
		
	}

}
