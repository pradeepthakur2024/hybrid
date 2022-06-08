package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAndRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         driver.get("https://www.flipkart.com/");
         
	WebElement target= driver.findElement(By.xpath("//span[text()='Cart']"));
	Actions act= new Actions(driver);
	act.contextClick(target).perform();
	//Robot robot = new Robot();
//	for(int i=o;i<robot.size();i++)	
//	{
//		robot.KeyPress(KeyEvent.VK_PAGE_DOWN);
//	}
Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_PAGE_DOWN);

robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_PAGE_DOWN);

	
	
	}

}
