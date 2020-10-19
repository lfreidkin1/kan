package com.kan;

import com.google.common.collect.Iterators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class Linkdin
{
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    WebElement Element;
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
        driver.get("https://www.linkedin.com/");
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }

    @Test
    public  void linkdin() throws InterruptedException {
        click(By.cssSelector(".nav__button-secondary"));
        type(By.name("session_key"),"alexandrfreidkin@gmail.com");
        type(By.name("session_password"),"shloimik");
        click(By.cssSelector("#app__container > main > div:nth-child(2) > form > div.login__form_action_container > button"));
  Thread.sleep(5000);
        type(By.cssSelector("#ember44 > input"), "Amazon Israel");
    click(By.cssSelector(".search-global-typeahead__button"));
    Thread.sleep(6000);
    for (int i=0;i<3;i++){
        jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(2000);
         Element = driver.findElement(By.cssSelector(".artdeco-pagination__button--next"));
        Element.click();}
        Thread.sleep(2000);
        jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,5000)");
Thread.sleep(3000);
        List<WebElement> cards = driver.findElements(By.xpath("//button[text()='Connect']"));
        jse.executeScript("window.scrollBy(0,-5000)");
 cards = driver.findElements(By.xpath("//button[text()='Connect']"));
        Thread.sleep(3000);

        for (WebElement c : cards) {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[text()='Connect']")).click();
            Thread.sleep(5000);
            Element = driver.findElement(By.xpath("//span[contains(.,'Send now')]"));
            if (Element.isEnabled()&&Element.isSelected()&&Element.isDisplayed()) {
                Element.click();
                Thread.sleep(2000);}
            else {
                driver.findElement(By.cssSelector(".artdeco-modal__dismiss")).click();
            }
            Thread.sleep(2000);
            Element = driver.findElement(By.cssSelector(".artdeco-pagination__button--next"));
            Element.click();
        }

        }



    }

