package methodsofwebdriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException 
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the browser which you want open");
		            String browserValue=sc.nextLine();
		            if(browserValue.equalsIgnoreCase("chrome"));
		            {
		            	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		           WebDriver driver = new ChromeDriver();
		            driver.manage().window().maximize();
		            driver.get("http://omayo.blogspot.com/");
		            driver.findElement(By.linkText("open a popup window")).click();
		            Thread.sleep(4000);
		            driver.quit();
		            }
	
	}
}
