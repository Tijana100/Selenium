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
public class Login {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void login() {
    driver.get("https://bonatti.rs/registracija.html");
    driver.manage().window().setSize(new Dimension(1051, 806));
    driver.findElement(By.cssSelector(".login-form > .form-group:nth-child(3) > .form-control")).click();
    driver.findElement(By.cssSelector(".login-form > .form-group:nth-child(3) > .form-control")).sendKeys("micamilivojevic0@gmail.com");
    driver.findElement(By.cssSelector(".login-form > .form-group:nth-child(4) > .form-control")).click();
    driver.findElement(By.cssSelector(".login-form > .form-group:nth-child(4) > .form-control")).sendKeys("Focusfocus1*");
    driver.findElement(By.cssSelector(".btn:nth-child(6)")).click();
    vars.put("pageurl", js.executeScript("return window.location.href"));
    assertEquals(vars.get("pageurl").toString(), "https://bonatti.rs/");
  }
}
