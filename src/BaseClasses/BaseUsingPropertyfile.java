package BaseClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import utilityPackage.UtilityUsingPropertyFiles;

public class BaseUsingPropertyfile {
	protected WebDriver driver;
	public void launchBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\BKP\\Downloads\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.get(UtilityUsingPropertyFiles.readDataFromPropertyFile("URL"));
		driver.manage().window().maximize();
		Reporter.log("Browserlaunched success",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));


	}
	public void closeBrowser() {
		
		driver.close();
		Reporter.log("Browser closed success",true);
	}


}
