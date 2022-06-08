package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeLogout extends BaseTest {

	

	private static final String PROP_PATH = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BaseTest bt = new BaseTest();
		bt.setUp(); //open the browser and lunch the web app
	Flib flib = new Flib();
		
		//read the data from excel file by using generic reusable methods
         String validusername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		
	LoginPage lp = new LoginPage(driver);
		lp.actiTimevalidLogin(validusername, validPassword);
		
		HomePage hp = new HomePage(driver);
		hp.clickLogout();

		
	}

}
