package KiteAppTestClasses;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.BaseUsingPropertyfile;
import KiteAppPOMClasses.KiteHomePage;
import KiteAppPOMClasses.KiteLogginPage;
import KiteAppPOMClasses.KitePinPage;
import utilityPackage.UtilityUsingPropertyFiles;

public class ValidatingKiteUserID extends BaseUsingPropertyfile {

	KiteLogginPage login;
	KitePinPage pin;
	KiteHomePage home;

	@BeforeClass
	public void browserLaunch() throws IOException {
		 launchBrowser();
		login=new KiteLogginPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		
		}
	
	@BeforeMethod
	public void loginToKiteApp() throws IOException {
		
		login.enterUserID(UtilityUsingPropertyFiles.readDataFromPropertyFile("UN"));
		login.enterPassword(UtilityUsingPropertyFiles.readDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.enterPin(UtilityUsingPropertyFiles.readDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
		
	}
	
	@Test
  public void validatingKiteAppUN() throws IOException {
		int  TCID=197;
		String ActualUserID = home.getActualUserId();
		String ExpecteduserID = UtilityUsingPropertyFiles.readDataFromPropertyFile("UN");
		assertEquals(ActualUserID, ExpecteduserID,"actual and expected userid is not macthing");
		UtilityUsingPropertyFiles.takeScreenshotAs(driver, TCID);
		
		
  }
	 @AfterMethod
	  public void LogoutFromKiteApp() throws InterruptedException {
		  
		  home.LogOut();
		  Reporter.log("Logging Out",true);
		  
	  }
	  @AfterClass
	  public void closingBrowser() {
		  closeBrowser();
	  }
}
