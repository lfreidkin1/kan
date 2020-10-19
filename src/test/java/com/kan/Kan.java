package com.kan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Kan {
WebDriver driver;
public void type (By locator,String text)
{
 driver.findElement(locator).click();
 driver.findElement(locator).clear();
 driver.findElement(locator).sendKeys(text);
}
 public void click (By locator){
 driver.findElement(locator).click();
}
@BeforeMethod
public void init(){
 driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.kan.org.il/");
}
@AfterMethod
 public void quit(){
 driver.quit();
 }
 @Test (priority = 1)
 public void openKanPage() throws InterruptedException {
driver.findElement(By.cssSelector(".live_button")).click();
click(By.id("kan11"));
isElementPresent(By.id("topHeaderLogo"));

 }
 @Test
public void verifyTitle()
{
    String actualTitle= driver.getTitle();
    String expectedResult = "חדשות, רדיו, דיגיטל, שידור חי ועוד | כאן תאגיד השידור הישראלי";
    Assert.assertEquals(actualTitle,expectedResult);
    System.out.println("Test Passed");
}
 public WebElement isElementPresent(By locator)
 {
return   driver.findElement(locator);
 }
 @Test (priority = 2)
public void hadashotBHaretz () throws InterruptedException {
 click(By.cssSelector("#HamburgerIcon"));
click(By.cssSelector("#navBarToggle > div.mega_menu_section.w-clearfix > div.mega_menu_navgroup.w-clearfix > div:nth-child(1) > div:nth-child(1) > a:nth-child(2)"));
  click(By.cssSelector("#HamburgerIcon"));
click(By.cssSelector("#navBarToggle > div.mega_menu_section.w-clearfix > div.mega_menu_navgroup.w-clearfix > div:nth-child(1) > div:nth-child(1) > a:nth-child(3)"));
click(By.cssSelector("#topHeaderLogo > img"));
 Thread.sleep(2000);
}
@Test (priority = 3)
public void languagesKan ()
{
 click(By.cssSelector("#form1 > div:nth-child(3) > div.header > div.header_black.w-clearfix > div.header_community.live > a"));
click(By.cssSelector("#navBarToggle > div.mega_menu_section.w-clearfix > div.mega_menu_languages > div > a:nth-child(6)"));
click(By.cssSelector("#play > img"));
}
@Test (dataProvider = "searchInfo")
 public void searchKan(String search) throws InterruptedException {
 driver.findElement(By.cssSelector(".search_top_button")).click();
 type(By.id("searchField"), search);
Thread.sleep(3000);
}
@DataProvider
 public Iterator <Object[]> searchInfo ()
 {
  List <Object[]> list = new ArrayList<>();
 list.add (new Object[] {"Kan1"});
 list.add (new Object[] {"Reka"});
 list.add (new Object[] {"News"});
 return list.iterator();
 }
}


