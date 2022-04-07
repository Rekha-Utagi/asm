package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityUsingPropertyFiles {
	
	public static String readDataFromPropertyFile(String key) throws IOException {
		Properties prop=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\seleniumFramwork@TsetNG\\src\\KiteAppTestData.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
		
	}
	 public static void takeScreenshotAs(WebDriver driver,int TCID) throws IOException {
		 
		File sourse = ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\BKP\\Downloads\\selenium tool\\ScreenShot\\TC"+TCID+"Screenshot.png");
		FileHandler.copy(sourse, dest);
		Reporter.log("screenshot taken for TC"+TCID,true);

	
}
}
