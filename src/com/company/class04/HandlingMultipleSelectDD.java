package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleSelectDD {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="https://syntaxprojects.com/basic-select-dropdown-demo.php";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement stateDD=driver.findElement(By.name("States"));
        Select select=new Select(stateDD);
        boolean isMultiple=select.isMultiple();
        System.out.println(isMultiple);
        List<WebElement> options=select.getOptions();
        for(WebElement option:options){
            String optionText=option.getText();
            select.selectByVisibleText(optionText);
        }
        select.deselectByIndex(5);

    }
}
