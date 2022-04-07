package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility
{
	static Sheet Mysheet;

	 public static String readDataFromExcel(int rowindex,int cellindex) throws EncryptedDocumentException, IOException {
		 FileInputStream Myfile=new FileInputStream("F:\\BKP\\Downloads\\sampledatafoodsales\\RekhaPatil.xlsx");
		 Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		String value = Mysheet.getRow(rowindex).getCell(cellindex).getStringCellValue();
		 return value;
		 }
	 public static void takeScreenshotAs(WebDriver driver,int TCID) throws IOException {
		 
		File sourse = ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\BKP\\Downloads\\selenium tool\\ScreenShot\\TC"+TCID+"Screenshot.png");
		FileHandler.copy(sourse, dest);
		Reporter.log("screenshot taken for TC"+TCID,true);
	 }
}
