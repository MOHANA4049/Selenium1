import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day9_2 {
	WebDriver driver;
  @Test
  public void TC_001() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  String url1="https://www.godaddy.com/en-in";
	  driver.get(url1);
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  String title=driver.getTitle();
	  String url=driver.getCurrentUrl();
	  String tit="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  Assert.assertEquals(title, tit);
	  Assert.assertEquals(url,url1);
	  Thread.sleep(1000);
	  driver.quit();
	  
  }
  @Test
  public void TC_002() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  String url="https://www.godaddy.com/";
	  driver.get(url);
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(1000);
	
  }
  @Test
  public void TC_003() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  String url="https://www.godaddy.com/";
	  driver.get(url);
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(1000);
	  String title=driver.getTitle();
	  System.out.print(title);
	  Assert.assertEquals(title,"GoDaddy Domain Search - Buy and Register Available Domain Names");
	   
  }
}
