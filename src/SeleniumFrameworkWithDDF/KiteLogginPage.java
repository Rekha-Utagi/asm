package SeleniumFrameworkWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogginPage {
	
	//step1 )variable declaration
	
	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;
	
	//step 2)To Initialize data member so we can create constructor
	
	public KiteLogginPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
  //step 3) utilization the data member so we can create method
	
	public void enterUserID() {
		
		UserID.sendKeys("HD5857");
	}
	public void enterPassword() {
		Password.sendKeys("Ajinkya@123");
		
	}
	public void clickOnLoginButton() {
		LoginButton.click();
		
	}
}
