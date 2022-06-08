package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
         driver.get("https://www.gmail.com");
      	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("pdpthakur0@gmail.com");
     	driver.findElement(By.xpath(" //span[@class='VfPpkd-vQzf8d']")).click();
    	driver.findElement(By.xpath("//input[@name='password']]")).sendKeys("89895656232");
    	driver.findElement(By.xpath(" //span[contains(text(),'Next')] ")).click();
        	}

}
