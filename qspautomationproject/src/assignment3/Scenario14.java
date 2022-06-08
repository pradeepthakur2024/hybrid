package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario14 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
         driver.get("https://www.Bluestone.com");
       driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
       Thread.sleep(3000);
		
		WebElement target = driver.findElement(By.xpath("//li[@class='menuparent gold-coins']"));
		Actions act = new Actions(driver);

		act.moveToElement(target).perform();
		  Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='1 gram']")).click();
		 Thread.sleep(3000);
		
		driver.close();
		  
		  
		  
	}

}
