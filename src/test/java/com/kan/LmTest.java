package com.kan;// Generated by Selenium IDE
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
public class LmTest {
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
  public void lm() {
    driver.get("https://www.lastminutetravel.com/");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector(".icon-calendar")).click();
    driver.findElement(By.cssSelector(".CalendarDay--hovered")).click();
    driver.findElement(By.cssSelector(".CalendarDay--hovered")).click();
    driver.findElement(By.cssSelector(".peopleCountTextDesktop")).click();
    driver.findElement(By.cssSelector(".adultsCol .selectBox")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".adultsCol .selectBox"));
      dropdown.findElement(By.xpath("//option[. = '3 adults']")).click();
    }
    driver.findElement(By.cssSelector(".adultsCol .selectBox")).click();
    driver.findElement(By.cssSelector(".childrenCol .selectBox")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".childrenCol .selectBox"));
      dropdown.findElement(By.xpath("//option[. = '1 child']")).click();
    }
    driver.findElement(By.cssSelector(".childrenCol .selectBox")).click();
    driver.findElement(By.cssSelector("li:nth-child(1) .selectBox")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector("li:nth-child(1) .selectBox"));
      dropdown.findElement(By.xpath("//option[. = '6']")).click();
    }
    driver.findElement(By.cssSelector("li:nth-child(1) .selectBox")).click();
    driver.findElement(By.cssSelector(".okBtn")).click();
    driver.findElement(By.id("find-hotels")).click();

  }
}
