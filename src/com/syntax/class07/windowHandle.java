package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();

//   get the address /handle of the page /window

        String signUpPageHandle=driver.getWindowHandle();
        System.out.println("The window handle for signup page is: " +signUpPageHandle);

// click on help.term,privacy

        WebElement helpbtn=driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement termbtn = driver.findElement(By.xpath("//a[text()='Terms']"));
        WebElement privacybtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
// click on them to open new windows

        helpbtn.click();
        termbtn.click();
        privacybtn.click();

 // we haven't switched the focus yet ,so it is still on the main/home/signup page
// to get all the windows handles

        Set<String> allWindowsHandles =driver.getWindowHandles();
// print the size of allWindowHandles

        System.out.println("number of window handles is: " +allWindowsHandles);

// in order to print all window handles we need to interate over the SET

        Iterator<String> it=allWindowsHandles.iterator();

        signUpPageHandle=it.next();
        String helpPageHandle= it.next();
        String termPageHandle= it.next();
        String privacyPageHandle= it.next();

        System.out.println("The handle for signup  page is " + signUpPageHandle);
        System.out.println("The handle for helppage  page is " +helpPageHandle);
        System.out.println("The handle for term  page is " + termPageHandle);
        System.out.println("The handle for privacy  page is " + privacyPageHandle);

//switch to help page

        driver.switchTo().window(privacyPageHandle);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

