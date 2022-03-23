package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class multiplySelectDd {

    public static <webElement> void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//navigate

        driver.get("http://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

//find the WebElement dropDown

        WebElement statesDD = driver.findElement(By.cssSelector("select#multi-select"));

//we can use select class so we will make an object of select class

        Select select = new Select(statesDD);

//select if the drop is multiple

        boolean ismul= select.isMultiple();
        System.out.println(ismul);

        select.selectByIndex(3);

        Thread.sleep(2000);

        select.selectByVisibleText("Texas");

        Thread.sleep(2000);

        select.selectByValue("Ohio");

        Thread.sleep(3000);

        select.deselectByIndex(3);

        Thread.sleep(2000);

        select.deselectByVisibleText("Texas");

// to iterator to get all options text and print in console

        //get all the options

        List<WebElement> options=select.getOptions();

        Iterator<WebElement> it=options.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getText());
        }
    }
}
