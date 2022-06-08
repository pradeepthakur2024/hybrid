package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartlaptopxpath {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
      Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class.=_2KpZ6l _2doB4z")).click();
        driver.findElement(By.xpath("http://www.w3.org/2000/svg")).sendKeys("laptop");
        driver.findElement(By.xpath("_4rR01T"));
        driver.findElement(By.xpath("_30jeq3 _1_WHN1"));
		
		
	}

}
