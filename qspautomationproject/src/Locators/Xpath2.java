package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.myntra.com/login");
	driver.findElement(By.xpath("//input[@name='<input autocomplete=\"new-password\" id=\"\" type=\"tel\" class=\"form-control mobileNumberInput\" placeholder=\"\" maxlength=\"10\" value=\"\">]")).sendKeys("Admin");
	//driver.findElement(By.xpath("//input[@name='class=\"_2IX_2- _3mctLh VJZDxU\" value=']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

}
