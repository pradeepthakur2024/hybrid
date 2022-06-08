package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeInValidLogi extends BaseTest {

	private static final String EXCEL_PATH = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		  BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
	 int rc = flib.getRowCount(EXCEL_PATH, "invalidcreads");
		for(int i=1;i<=rc;i++)
		{
			String invalidusername = flib.readExcelData(EXCEL_PATH, "invalidcreads", i,0);
			 String invalidpassword = flib.readExcelData(EXCEL_PATH, "invalidcreads", i, 1);
			
			 lp.actiTimevalidLogin(invalidusername, invalidpassword);
			
		}
		bt.tearDown();
		
		
	}

}
