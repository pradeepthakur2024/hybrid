import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     WebDriver driver = new ChromeDriver ();
     driver.manage().window().maximize();
     driver.get("http://www.editplus.com");
     Thread.sleep(5000);
     driver.close();
    

	}

}
