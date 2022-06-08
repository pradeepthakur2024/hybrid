package KeywordDrivenFramework;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataDrivenFramework.Flib;

public class BaseTest {
	static WebDriver driver;
	//method to open the browser
	@SuppressWarnings("deprecation")
	public void openBrowser()
	{
	Flib flib= new Flib();
	 String browservalue = flib.readPropertyFile("./data/config.properties","browser");
	 String url = flib.readPropertyFile("./data/config.properties","url");
	
	if (browservalue.equalsIgnoreCase("chrome"))	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get(url);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	
	}
		else if(browservalue.equalsIgnoreCase("firefox"))
			
		{
			System.setProperty("webdriver.geoko.driver", "./drivers/geokodriver.exe");
			 FirefoxDriver Driver1 = new FirefoxDriver();
			Driver1.manage().window().maximize();
			Driver1.get(url);
			Driver1.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("enter the correct choice");
		}
	}
	
	
public void closeBrowser()
{
	driver.quit();
}
	
}

