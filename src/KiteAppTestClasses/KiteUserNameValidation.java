package KiteAppTestClasses;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Base;
import KiteAppPOMClasses.KiteHomePage;
import KiteAppPOMClasses.KiteLogginPage;
import KiteAppPOMClasses.KitePinPage;
import utilityPackage.Utility;

public class KiteUserNameValidation extends Base {
	KiteLogginPage login;
	KitePinPage pin;
	KiteHomePage home;
	@BeforeClass
	public void browserLaunch() {
		 launchBrowser();
		login=new KiteLogginPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		
		}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException {
		
		login.enterUserID(Utility.readDataFromExcel(0, 0));
		login.enterPassword(Utility.readDataFromExcel(0, 1));
		login.clickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		
		pin.enterPin(Utility.readDataFromExcel(0, 2));
		pin.clickOnContinueButton();
		
	}
  @Test
  public void validatingUserName() throws EncryptedDocumentException, IOException{
	  int TCID=100;
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  String actualUserId = home.getActualUserId();
	  String ExpcetedUserId = Utility.readDataFromExcel(0, 0);
	  assertEquals(ExpcetedUserId, actualUserId,"actual and expected user id is not matching");
	  Utility.takeScreenshotAs(driver, TCID);
	  Reporter.log("validatingUserName",true);
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
