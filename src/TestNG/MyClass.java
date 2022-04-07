package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass {

	  @Test
	  public void method1() throws InterruptedException
	  {
		System.setProperty("webdriver.chrome.driver", "F:\\BKP\\Downloads\\selenium tool\\chromedriver_win32\\chromedriver.exe");

			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
	  }
	  @Test
	  public void method2() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\BKP\\Downloads\\selenium tool\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://vctcpune.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
	  }
	  @Test
	  public void method3() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver","F:\\BKP\\Downloads\\selenium tool\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
	  }
	  @Test
	  public void method4() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\BKP\\Downloads\\selenium tool\\chromedriver_win32\\chromedriver.exe" );
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
	  	}
}