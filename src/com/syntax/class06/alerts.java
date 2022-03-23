package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static <webElement> void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


//navigate

        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

// enable alert

        driver.findElement(By.cssSelector("button#alert")).click();
        Thread.sleep(2000);

//switch the focus of selenium

        Alert simpleAlert=driver.switchTo().alert();

        simpleAlert.accept();

//handeling confirmation alert
//enabling the confirmation alert
        driver.findElement(By.cssSelector("button#confirm")).click();

        //switch the focus

        Alert confirmationAlert=driver.switchTo().alert();

//get the text from the alert

        System.out.println(confirmationAlert.getText());

//cancel alert

        confirmationAlert.dismiss();

//enable prompt alert

        driver.findElement(By.cssSelector("button#prompt")).click();


//switch focus

        Alert promptAlert=driver.switchTo().alert();



//send some keys to this alert

        promptAlert.sendKeys("hello we need sleep");

//accept

        promptAlert.accept();


    }
}
