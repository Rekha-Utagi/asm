package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeExcludeTest {

	//total 100--> 30 want to execute--> 70 don't want
		//I have a,b,c d
		//I want a,c
		//I don't want b,d
		@Test(groups= {"sanity"})
		  public void a()  
		  {
			
			Reporter.log("Running method A ", true);
		  }
		  @Test(groups= "regression")
		  public void b()
		  {
			  Reporter.log("Running method B ", true);
		  }
		  @Test(groups= {"sanity"})
		  public void c()
		  {
			  Reporter.log("Running method C ", true);
		  }
		  @Test(groups= "regression")
		  public void d()
		  {
			  Reporter.log("Running method D ", true);
}
}