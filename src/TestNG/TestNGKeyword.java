package TestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGKeyword {
	  @Test(invocationCount = 3)
	  public void myMethod() 
	  {
		  Reporter.log("This is my Method", true);
		  
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  Reporter.log("Running before Method", true);
	  }
	  
	  @Test
	  public void a() throws InterruptedException
	  {
		Thread.sleep(2000);
		Reporter.log("Running method A ", true);
	  }
	  @Test(dependsOnMethods = {"a"})
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

