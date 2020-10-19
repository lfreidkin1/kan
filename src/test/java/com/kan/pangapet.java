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

public class pangapet extends Kan {
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
        driver.get("https://www.pangapet.co.il/");
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }
    @Test
    public void openPanga() throws InterruptedException {
driver.get("https://www.pangapet.co.il/148714-%D7%9E%D7%96%D7%95%D7%9F-%D7%99%D7%91%D7%A9-%D7%9C%D7%9B%D7%9C%D7%91");
  click(By.xpath("//div[@id='item_id_2533633']//img[contains(@class,'img-responsive opacity-hover')]"));


    }

}
