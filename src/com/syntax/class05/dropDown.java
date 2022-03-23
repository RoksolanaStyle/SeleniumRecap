package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static <webElement> void main(String[] args) throws InterruptedException  {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//navigate

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

//find the WebElement "drop down"

        WebElement days= driver.findElement(By.cssSelector("select#select-demo"));

        //use the select class to select from drop down

        Select select= new Select(days);

  //SELECT BY INDEX

        //      select.selectByIndex(1);
        //     Thread.sleep(3000);

        //      select.selectByIndex(4);
        //     Thread.sleep(3000);


        //      select.selectByIndex(7);
        //     Thread.sleep(3000);


//Select by visible text

        //     select.selectByVisibleText("Thursday");

//Select by value

        //       select.selectByValue("Wednesday");

//select get.Options--> no parameter
        List<WebElement> allOptions =select.getOptions();
        int size=allOptions.size();
        System.out.println(size);

        //iterate through list all options and get the text of each option

        for(int i=0; i<size; i++ ){
            String OptionText=allOptions.get(i).getText();
            System.out.println(OptionText);
        }
    }
}
