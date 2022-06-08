package windowpopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileautoit {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
         driver.get("http://190.210.184.180/login.do");
		
         driver.findElement(By.name("username")).sendKeys("admin");

         driver.findElement(By.name("pwd")).sendKeys("manager");
         driver.findElement(By.id("loginButton")).click();
         Thread.sleep(1000);

         driver.findElement(By.linkText("setting")).click();
         Thread.sleep(1000);
         driver.findElement(By.partialLinkText("Logo")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("uploadNewLogoOption")).click();
       Actions act = new Actions(driver);
      WebElement target = driver.findElement(By.name("fromCustomInterfaceLogo.logo"));
    //  = new File("./")  
      
      
      
	}

}

