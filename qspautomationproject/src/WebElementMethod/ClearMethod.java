package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	
			public static void main(String[] args) throws InterruptedException
	{
	
ChromeDriver driver=new ChromeDriver();  //open the chrome browser
	
	driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://opensource-demo.orangehrmlive.com/");
	
	
	}

}
