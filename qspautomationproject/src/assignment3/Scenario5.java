package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
         driver.get("https://www.Bluestone.com");
         driver.findElement(By.xpath("//span[@id='denyBtn']")).click();

        // Thread.sleep(4000);
      //   driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Apple Watches");
      WebElement targetToMouseHover =driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
      Actions act =new Actions(driver);
		act.moveToElement(targetToMouseHover).perform();
		
		driver.findElement(By.xpath("//a[@title='Diamond Rings']")).click();

		driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']")).click();

		
		
		
	}

}