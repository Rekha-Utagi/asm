package crossbrowserTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchChcrome {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\BKP\\Downloads\\selenium tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		

}
}
