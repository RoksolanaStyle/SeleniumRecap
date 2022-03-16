package com.syntax01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com");
        String title = driver.getTitle();

        System.out.println("The current title of the page is:" + title);
        String url = driver.getCurrentUrl();

        System.out.println("The current URL loaded in browser is: " + url);
        driver.quit();
    }
}

