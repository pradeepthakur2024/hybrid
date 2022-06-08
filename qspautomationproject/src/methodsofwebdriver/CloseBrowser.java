package methodsofwebdriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc =new Scanner (System.in);
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OPen a popup window"));
		Thread.sleep(5000);
		driver.close();
	}

}

