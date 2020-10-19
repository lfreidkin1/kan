package com.kan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Date;

public class Lastminutetravel {
    WebDriver driver;
    Select select;
    Action action;
    WebElement wb;
    public void type (By locator, String text)
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
        driver.get("https://www.lastminutetravel.com/");
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }
@Test
    public void lastminutesearch ()
{
    type(By.xpath("//input[@id='autosuggest-hotels']"),"Kishinev");
    click(By.cssSelector(".icon-calendar"));

}


}
