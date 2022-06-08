package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///c:Users/HP/Desktop/1wcms7htmldocs/checkbox.html");
        String sourceCodeOfTheWebPage = driver.getPageSource();
        System.out.println(sourceCodeOfTheWebPage);
        
	}

}
