package com.kan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kan1 {
    WebDriver driver;
    public void click(By locator){
        driver.findElement(locator).click();}
        public void type(By locator,String text)
        {
            driver.findElement(locator).click();
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    @BeforeMethod
    public void init ()
    {
        driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.kan.org.il/");
    }
    @AfterMethod
    public void quit(){
    driver.quit();
    }
@Test
    public void openBVideoKan () throws InterruptedException {
        click(By.cssSelector("#form1 > div:nth-child(10) > div:nth-child(3) > div > div.light_box_video.w-lightbox > a"));
       driver.switchTo().frame(1);
        click(By.cssSelector(".ytp-ce-element"));
    driver.manage().wait(5);
    }
}
