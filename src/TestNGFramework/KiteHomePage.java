package TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	@FindBy(xpath="//span[@class='user-id']")private WebElement userID;
	
	@FindBy(xpath="//a[@target='_self']")private WebElement logOutButton;
	
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
    public String getActualUserId() {
    	
    	String ActualuserID = userID.getText();
    	return ActualuserID;
    	//if else is not Required for testNG
/*    	if(ActualuserID.equals(ExpecteduserID))
    	{
    	 System.out.println("UserName is Matching TC is Passed");	
    	}
    	else
    	{
    		System.out.println("UserName is Not Matching TC is Failed");
    	}
    	
*/    
    }
    public void LogOut() throws InterruptedException {
    		
    	
    	userID.click();
    	Thread.sleep(200);
    	logOutButton.click();
    	}
    
    }   	

