import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Task5 {
  @Test(groups="smoke test")
  public void f() {
	  System.out.println("smoke test:1");
  }
  @Test(groups="regression test")
  public void f1() {
	  System.out.println("regression test:2");  
  }
  @Test(groups="regression test")
  public void f2() {
	  System.out.println("regression test:3");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
