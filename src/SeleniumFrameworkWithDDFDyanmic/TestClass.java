package SeleniumFrameworkWithDDFDyanmic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		 System.setProperty("webdriver.chrome.driver","F:\\BKP\\Downloads\\selenium tool\\chromedriver_win32\\chromedriver.exe");
			//ChromeOptions opt=new ChromeOptions();
			//opt.addArguments("headless");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			FileInputStream Myfile=new FileInputStream("F:\\BKP\\Downloads\\sampledatafoodsales\\RekhaPatil.xlsx");
			Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
			String UN = MySheet.getRow(0).getCell(0).getStringCellValue();
			String Pass = MySheet.getRow(0).getCell(1).getStringCellValue();
			String PIN = MySheet.getRow(0).getCell(2).getStringCellValue();
			
			Thread.sleep(1000);
			
			KiteLogginPage Login=new KiteLogginPage(driver);
			
			Login.enterUserID(UN);
			Login.enterPassword(Pass);
			Login.clickOnLoginButton();
			
			KitePinPage Pin=new KitePinPage(driver);

			Pin.enterPin(PIN);
			Pin.clickOnContinueButton();
			Thread.sleep(1000);
			
			KiteHomePage Home=new KiteHomePage(driver);

			
			Home.ValidatingUserId(UN);
			Home.LogOut();
			
			driver.close();
	}

}
