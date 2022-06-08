package MouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         driver.get("https://demo.guru99.com/test/smiple_context_menu.html");
        WebElement target=driver.findElement(By.xpath("//span[text()='right click me']"));
         Thread.sleep(2000);
         Actions act = new Actions(driver);
         act.contextClick(target).perform();
	}

}
