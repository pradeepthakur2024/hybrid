	package assignment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
         driver.get("https://jqueryui.com/droppable/");
       driver.switchTo().frame(0);
     	 WebElement src=driver.findElement(By.xpath("//p[.='Drag me to my target']"));
  WebElement target=driver.findElement(By.xpath("//p[.='Drop here']"));
     	 
  Actions act=new Actions(driver);
  act.dragAndDrop(src, target).perform();
  
	}

}
