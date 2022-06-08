package KeywordDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActiTimevalidlogin extends BaseTest {

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		
		Flib flib = new Flib();
         String username = flib.readExcelData("./Data/ActiTimeTestData.xlsx","validcreds",1,0);
         
         String password = flib.readExcelData("./Data/ActiTimeTestData.xlsx","validcreds",1,1);
         bt.openBrowser();
         Thread.sleep(3000);

         driver.findElement(By.name("username")).sendKeys(username);
         driver.findElement(By.name("pwd")).sendKeys(password);
         driver.findElement(By.id("loginButton")).click();
         Thread.sleep(2000);
         
        bt.closeBrowser();
          
         
	}

}
