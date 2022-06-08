package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

//declaration
	
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutLink;
	@FindBy(xpath="//a[.=Create new Tasks']") private WebElement createNewTasks;
	@FindBy(linkText="Settings") private WebElement settings;
	
	
	//intialiaztion
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utiliation

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public WebElement getCreateNewTasks() {
		return createNewTasks;
	}
	public WebElement getSettings() {
		return settings;
	}

	public void clickLogout() {
		// TODO Auto-generated method stub
		clickLogout();
	}
	
	
	}


