package KiteAppPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogginPage {
	
	//step1 )variable declaration
	
	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;
	@FindBy(xpath="//span[contains(text(),'User ID should be')]") private WebElement UserIdErrorMsg;
	//step 2)To Initialize data member so we can create constructor
	
	public KiteLogginPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
  //step 3) utilization the data member so we can create method
	
	public void enterUserID(String userName) {
		
		UserID.sendKeys(userName);
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
		
	}
	public void clickOnLoginButton() {
		LoginButton.click();
		
	}
	public String getUserIDErrorMsg() {
		String errorMsg = UserIdErrorMsg.getText();
		return errorMsg;
		
	}
}
