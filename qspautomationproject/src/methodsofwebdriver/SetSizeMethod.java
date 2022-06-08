package methodsofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Dimension targetSize= new Dimension(450,250);
	driver.manage().window().setSize(targetSize);
	Thread.sleep(5000);
	driver.close();

	}

}
