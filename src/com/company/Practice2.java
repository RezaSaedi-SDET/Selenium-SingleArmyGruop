package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.fb.com");
        driver.findElement(By.id("email")).sendKeys("JORGE456");
        driver.findElement(By.id("pass")).sendKeys("3455dfs");
        driver.findElement(By.name("login")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Forgot password?")).click();
        driver.quit();

    }
}
