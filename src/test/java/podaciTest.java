import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
public class podaciTest {
	private Logger log = Logger.getLogger(podaciTest.class.getName());
	private SimpleDateFormat formatter;
	private Date date;
	
  private WebDriver driver;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	date = new Date();
	  
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void podaciOKompaniji() throws InterruptedException {
	  driver.get("https://bonatti.rs/online-shop/1.html");
	  driver.manage().window().setSize(new Dimension(706, 812));
    
    String text = driver.findElement(By.xpath("//div[2]/p")).getText();
    
    System.out.println(text);
   	String rezultat = "Test name: PodaciOKompanijiTest";

   			log.info(rezultat);
   			File dir = new File("C:\\Users\\TIJANA\\eclipse-workspace2\\SeleniumFramework");
   			File reportFile = new File(dir,"Okompaniji-report.txt");
   			if (!dir.exists() && !reportFile.exists()) {
   				  dir.mkdir();
   			      try {
   			          reportFile.createNewFile();
   			      } catch (IOException e) {
   			          System.out.println("Error creating file: " + e.getMessage());
   			      }
   			  }
   			  
   			  try(FileWriter fw = new FileWriter(".\\report\\Okompaniji-report.txt", true)) {
   				  fw.write(formatter.format(date) + "\n");
   				  fw.write(rezultat);
   			  } catch (IOException e) {
   				  System.out.println("Error writing to file: " + e.getMessage());
   			  }
   			  log.info(text);
   				  try(FileWriter fw = new FileWriter(".\\report\\Okompaniji-report.txt", true)) {
   					  fw.write(formatter.format(date) + "\n");
   					  fw.write(text);
   				  } catch (IOException e) {
   					  System.out.println("Error writing to file: " + e.getMessage());
   				  }
  }
}



