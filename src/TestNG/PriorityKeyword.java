package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeyword {

	 @Test(groups= "regression")
	  public void a()
	  {
		  Reporter.log("Running method A ", true);
	  }
	  @Test(priority = 2, invocationCount = 2)
	  public void b()
	  {
		  Reporter.log("Running method B ", true);
	  }
	  @Test(groups= "regression")
	  public void c()
	  {
		  Reporter.log("Running method C ", true);
	  }
	  @Test(priority = -1)
	  public void d()
	  {
		  Reporter.log("Running method D ", true);
	  }	
}
