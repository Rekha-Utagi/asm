package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation {
  @Test
  public void TC1() {
	  Reporter.log("Tast Case 1 is pass",true);
  }
  @BeforeMethod
  public void TC2() {
	  Reporter.log("Tast Case 2 is pass",true);
  }
  @AfterMethod
  public void TC3() {
	  Reporter.log("Tast Case 3 is pass",true);
  }
  @AfterClass
  public void TC4() {
	  Reporter.log("Tast Case 4 is pass",true);
  }
  @BeforeClass
  public void TC5() {
	  Reporter.log("Tast Case 5 is pass",true);
  }
}
