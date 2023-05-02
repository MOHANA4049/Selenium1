
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Task1 {
  @Test(priority=1)
  public void  f()
  {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Guest Registration Form – User Registration");
	 
  }
}
