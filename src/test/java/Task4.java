import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Task4 {
    WebDriver driver=new EdgeDriver();
	@Test
	public void Login() throws InterruptedException
	{
		  WebDriverManager.edgedriver().setup();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(5000);
		  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  System.out.println("Logged in successfully");
	}
	@Test(dependsOnMethods=("Login"))
	public void Logout() throws InterruptedException
	{
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Mohana");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("Mohana123",Keys.ENTER);
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		  String url = driver.getCurrentUrl();
		  Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(3000);
		  System.out.println("Logged out successfully");
		  driver.quit();
		
	}
	@BeforeTest
	public void BeforeTest() throws InterruptedException
	{
		driver.manage().window().maximize();
	}

}
