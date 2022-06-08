package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementmethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://www.google.com");
         driver.switchTo().activeElement().sendKeys("bike");
         Thread.sleep(5000);
	//	        driver=driver.findElement(By.xpath("class=\"gLFyf gsfi\"));
		        	
		        
       
	}

}
