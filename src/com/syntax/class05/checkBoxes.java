package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //navigate to syntax checkbox demo and check the first checkbox
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //locate the webelement checkbox
        WebElement singleCheckBox=  driver.findElement(By.cssSelector("input#isAgeSelected"));
        singleCheckBox.click();
        Thread.sleep(2000);

        //uncheck the click box
        singleCheckBox.click();

        //Task 2 check all the text boxes simultane
        //Select Xpath that has common attribute value for all the checkboxes

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

//print the number of checkBoxes

        int size=checkBoxes.size();

        System.out.println("The total number of checkboxes is: "+size);

        // iterete througth each WebElement

        for (WebElement checkbox : checkBoxes){
            //      checkbox.click();


            //select the checkbox with text(option 3)
            // get the attribute "value" of all checboxes
            String  valueOfAttribute =checkbox.getAttribute("value");
            System.out.println(valueOfAttribute)  ;

//check only value "Option-3"
            if(valueOfAttribute.equalsIgnoreCase("Option-3")) {

                //click on a checkbox whose attribute value is "Option-3"
                checkbox.click();
            }

        }

    }
}
