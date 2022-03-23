package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement femaleRadioBtn=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
        //      femaleRadioBtn.click();
//check is famale radio btn  is displayed
        boolean isDisplayed= femaleRadioBtn.isDisplayed();
        System.out.println("The female radio button is displayed on the webPage    :" +isDisplayed );

//check is famale radio btn is Enabled
        boolean isEnabled= femaleRadioBtn.isEnabled();
        System.out.println("The female radio button is Enabled on the webPage    :" + isEnabled);

//check is famale radio btn is selected
        boolean isSelected= femaleRadioBtn.isSelected();
        System.out.println("The female radio button is Selected on the webPage    :" + isSelected);

//select the female radio btn only if its enabled
        if (isEnabled){
            femaleRadioBtn.click();
        }

//after clicking the btn print  if it's selected or not

        isSelected=femaleRadioBtn.isSelected();
        System.out.println("The female radio button is Selected on the webPage    :" + isSelected);

    }
}
