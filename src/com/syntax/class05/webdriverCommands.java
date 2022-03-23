package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverCommands {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //navigate to this website
        //fill the user name "AON"
        //delete the user name
        //fill the new user name "Tester"


//find a webelement
        WebElement userName=driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));

        //send the text"AON"
        userName.sendKeys("AON");

        Thread.sleep(2000);
//delete the username entered
        userName.clear();

        Thread.sleep(2000);
//enter the new username
        userName.sendKeys("Tester");
    }
}
