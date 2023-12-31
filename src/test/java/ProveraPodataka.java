// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ProveraPodataka {
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
  public void provera() {
    driver.get("https://bonatti.rs/moj-profil.html");
    driver.manage().window().setSize(new Dimension(1054, 808));
    {
      String value = driver.findElement(By.name("first_name")).getAttribute("value");
      assertThat(value, is("Tijana"));
    }
    {
      String value = driver.findElement(By.name("last_name")).getAttribute("value");
      assertThat(value, is("Milivojevic"));
    }
    driver.findElement(By.name("email")).click();
    {
      String value = driver.findElement(By.name("email")).getAttribute("value");
      assertThat(value, is("micamilivojevic0@gmail.com"));
    }
    {
      String value = driver.findElement(By.name("address")).getAttribute("value");
      assertThat(value, is("Viljusa bb"));
    }
    {
      String value = driver.findElement(By.name("place")).getAttribute("value");
      assertThat(value, is("165"));
    }
    {
      String value = driver.findElement(By.name("contact_phone")).getAttribute("value");
      assertThat(value, is("0606328810"));
    }
  }
}
