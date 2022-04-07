package TestNGFramework;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestUsingTestNGClass {
	WebDriver driver;
	  Sheet Mysheet;
	KiteLogginPage login;
	KitePinPage pin;
	KiteHomePage home;
  @BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException 
  {
	  Reporter.log("launching Browser",true);
	  System.setProperty("webdriver.chrome.driver","F:\\BKP\\Downloads\\selenium tool\\chromedriver_win32\\chromedriver.exe" );
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	   driver=new ChromeDriver(opt);
	   driver.get("https://kite.zerodha.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   Reporter.log("Browser launch succesfully",true);
	   
	   FileInputStream Myfile=new FileInputStream("F:\\BKP\\Downloads\\sampledatafoodsales\\RekhaPatil.xlsx");
	   Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
	  login=new KiteLogginPage(driver);
	  pin=new KitePinPage(driver);
	  home=new KiteHomePage(driver);
	   
  }
  @BeforeMethod
  public void loginToKiteApp() {
	  String UID = Mysheet.getRow(0).getCell(0).getStringCellValue();
	  String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
	  String realpin = Mysheet.getRow(0).getCell(2).getStringCellValue();
	  Reporter.log( " Entering UserID  and Password",true);
	  login.enterUserID(UID);
	  login.enterPassword(PWD);
	  login.clickOnLoginButton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  Reporter.log("Entering PIN",true);
	  pin.enterPin(realpin);
	  pin.clickOnContinueButton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	  
	  }
  @Test
  public void ValidateUserID() {
	  Reporter.log("validating UserID",true);
	  String ExpectedUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
	  String ActualUserID = home.getActualUserId();
	  assertEquals(ActualUserID, ExpectedUserID,"actual and expected userid is not matching");
	  Reporter.log("UserID validating sucssesfully,Tc is passed",true);
	  
  }
  
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException {
	
	  Reporter.log("logging out",true);
	  home.LogOut();
	  
	 }
   @AfterClass
   public void closeBrowser() {
	   
	Reporter.log("closing browser",true);   
	driver.close();
   }
}
