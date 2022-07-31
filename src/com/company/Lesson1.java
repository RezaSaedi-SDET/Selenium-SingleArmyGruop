package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson1 {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        String expectedTitle="Google";
        if (title.equals(expectedTitle)){
            System.out.println("Title is correct");

        }else {
            System.out.println("Title is not correct");
        }
        driver.quit();

    }
}
