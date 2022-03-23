package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommands {
    public static void main(String[] args)  {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//go to website ebay.com

        driver.get("https://www.ebay.com/");

// get all links that are there on ebay
//as we have multiple elements with tag name "a" so we use driver.findelements
//as there are multiple elements so we need to store it in list of WebElements

        List<WebElement> links = driver.findElements(By.tagName("a"));

//print the size of list
        System.out.println("The size of list containing links is : "+ links.size());

//print all the text in  links
        for(WebElement link:links) {

//get the text of webElement
            String linkText = link.getText();

//only print the links that have some text and ignore the rest
            if (!linkText.isEmpty()) {
                System.out.println(linkText);

                //   print all the links also along with the text
//  use the method .getAtrribute to have the value of a particular attribute in the tag
                String linkAddress= link.getAttribute("href");
                System.out.println(linkAddress);

            }
        }

    }
}
