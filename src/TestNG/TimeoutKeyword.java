package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutKeyword {
	
	@Test(timeOut = 2000)
	  public void a() throws InterruptedException
	  {
		Reporter.log("Running method A ", true);
		Thread.sleep(3000);
		
	  }
	  @Test
	  public void b()
	  {
		  Reporter.log("Running method B ", true);
	  }
	  @Test
	  public void c()
	  {
		  Reporter.log("Running method C ", true);
	  }
	  @Test
	  public void d()
	  {
		  Reporter.log("Running method D ", true);
	  }
	
}
