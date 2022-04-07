package SeleniumFrameworkWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","F:\\BKP\\Downloads\\selenium tool\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			KiteLogginPage Login=new KiteLogginPage(driver);
			KitePinPage Pin=new KitePinPage(driver);
			KiteHomePage Home=new KiteHomePage(driver);
			
			Login.enterUserID();
			Login.enterPassword();
			Login.clickOnLoginButton();
			
			Pin.enterPin();
			Pin.clickOnContinueButton();
			Thread.sleep(1000);
			
			
			Home.ValidatingUserId();
			Home.LogOut();
			
			driver.close();
	}

}
