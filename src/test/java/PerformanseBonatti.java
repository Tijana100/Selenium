
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformanseBonatti {

	  private WebDriver driver;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    new HashMap<String, Object>();
	  }
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void performanse() throws InterruptedException {
	    driver.get("https://bonatti.rs/prijava.html");
	    driver.manage().window().setSize(new Dimension(1552, 840));
	    driver.findElement(By.cssSelector(".login-form > .form-group:nth-child(3) > .form-control")).click();
	    driver.findElement(By.cssSelector(".login-form > .form-group:nth-child(3) > .form-control")).sendKeys("micamilivojevic0@gmail.com");
	    driver.findElement(By.cssSelector(".login-form > .form-group:nth-child(4) > .form-control")).click();
	    driver.findElement(By.cssSelector(".login-form > .form-group:nth-child(4) > .form-control")).sendKeys("Focusfocus1*");
	    driver.findElement(By.cssSelector(".btn:nth-child(6)")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[2]/a[2]/span")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[3]/span")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'Žene')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'Žene')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'Muškarci')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[2]/a/span")).click();
	    Thread.sleep(2000);
	    
	    
	    double time1=System.currentTimeMillis();
		 driver.get("https://bonatti.rs/bonatti.html?search=1&wishlist=1");
		 double currentTime1=System.currentTimeMillis();
		 double totalTime1=currentTime1-time1;
		 System.out.println("Lista zelja: "+totalTime1+" ms");
		 
		 double time2=System.currentTimeMillis();
		 driver.get("https://bonatti.rs/kupovina-online.html");
		 double currentTime2=System.currentTimeMillis();
		 double totalTime2=currentTime2-time2;
		 System.out.println("Korpa: "+totalTime2+" ms");
		 
		 double time3=System.currentTimeMillis();
		 driver.get("https://bonatti.rs/zene.html");
		 double currentTime3=System.currentTimeMillis();
		 double totalTime3=currentTime3-time3;
		 System.out.println("Zene: "+totalTime3+" ms");
		 
		 double time4=System.currentTimeMillis();
		 driver.get("https://bonatti.rs/zene.html");
		 double currentTime4=System.currentTimeMillis();
		 double totalTime4=currentTime4-time4;
		 System.out.println("Muskarci: "+totalTime4+" ms");
		 
		 double time5=System.currentTimeMillis();
		 driver.get("https://bonatti.rs/moj-profil.html");
		 double currentTime5=System.currentTimeMillis();
		 double totalTime5=currentTime5-time5;
		 System.out.println("Profil: "+totalTime5+" ms");
		 
	  }

}
