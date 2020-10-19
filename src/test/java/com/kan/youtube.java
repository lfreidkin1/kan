package com.kan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class youtube {
    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
    }
    @AfterMethod
    public void quit()
    {
        driver.quit();
    }
    public void click(By locator){
        driver.findElement(locator).click();
    }
    public void type(By locator, String text){
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
    @Test
    public void luntikSearch ()
    {
type(By.id("search"), "luntik");
    }
}
