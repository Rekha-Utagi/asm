package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(listener.Listener.class)
public class Testing {
  @Test
  public void a() {
	  Reporter.log("TC a is running",true);
  }
  @Test
  public void b() {
	  Assert.fail();
	  Reporter.log("TC b is running",true);
  }
  @Test(dependsOnMethods= {"b"})
  public void c() {
	  Reporter.log("TC c is running",true);
  }
}
