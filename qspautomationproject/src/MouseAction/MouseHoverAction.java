package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.bluestone.com/");
         driver.findElement(By.id("denyBtn")).click();
         Thread.sleep(2000);
    //   WebElement target = driver.FindElement(By.XPath(""))
      //   Actions act=new Actions(driver);
     //    act.moveToElement(target).perform().
	}

}
