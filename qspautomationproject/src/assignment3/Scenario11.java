package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
         driver.get("https://www.Bluestone.com");
       driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
       Thread.sleep(3000);
   	WebElement target = driver.findElement(By.xpath("//span[@class='prcs-d' and .='Offers ']"));
	Actions act = new Actions(driver);

	act.moveToElement(target).perform();
	  Thread.sleep(3000);
	driver.findElement(By.xpath("//span[.='10% Making Charges Off on Plain Gold Jewellery']")).click();
	 Thread.sleep(3000);
	
	driver.close();
   
       
       
		
	}

}
