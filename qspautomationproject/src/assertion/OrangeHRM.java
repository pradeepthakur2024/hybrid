package assertion;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRM {
  private RemoteWebDriver driver;
@Test
  public void setproperty() 
  {
	  
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      }
    @BeforeMethod
    public void launchBrowser()
    {
    	 driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Test
    public void testcase() throws InterruptedException 
    {
    	SoftAssert softAssert = new SoftAssert();
    	 String actualLoginPageTitle = driver.getTitle();
		//String actualLoginPageTitle = driver.getTitle();
		softAssert.assertEquals(actualLoginPageTitle,"OrangeHRM");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement dashboard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean statusofDashBoard = dashboard.isDisplayed();
		Assert.assertEquals(statusofDashBoard, true);
		Thread.sleep(3000);
		
		String actualHomePageTitle = driver.getTitle();
    	
		softAssert.assertEquals(actualHomePageTitle, "OrangeHRMHomePage");
		Reporter.log("create user", true);
		Reporter.log("create contact", true);
		softAssert.assertAll();
	
    }
  
  
  
}
