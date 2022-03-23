package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class advanceXpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username=driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input"));
        username.sendKeys("admin");

        WebElement password=driver.findElement(By.xpath("//div[@id='divPassword']/input"));
        password.sendKeys("Hum@nhrm123");

        WebElement login=driver.findElement(By.xpath("//input[starts-with(@value,'LOG')]"));
        login.click();
    }
}
