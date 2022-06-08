package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeWithExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("//http://desktop-aid1054/login.do");
		Thread.sleep(4000);
		
		FileInputStream fis =new FileInputStream("./Data/actiTimelogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);		
		Sheet sh= wb.getSheet("Sheet1");
		  Row row = sh.getRow(1);
		 Cell cell =row.getCell(0);

		String username = cell.getStringCellValue();
		 
		FileInputStream fis2 =new FileInputStream("./Data/actiTimelogin.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis);		
		Sheet sh2= wb2.getSheet("Sheet1");
		  Row row2 = sh2.getRow(1);
		 Cell cell2 =row2.getCell(0);

		String password= cell2.getStringCellValue();
		 
		 driver.findElement(By.xpath("username")).sendKeys(username);
		 driver.findElement(By.xpath("pws")).sendKeys(password); 
		 driver.findElement(By.id("loginButton")).click();
	}

}
