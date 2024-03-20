package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //Invoking Browser
        //Chrome-ChromeDriver ->Methods close get
        //firefox-firefoxDriver ->Methods close get
        //Safari-SafariDriver ->Methods close
        //EveryBrowser have same method
        //Webdriver methods + class methods
        //chromedriver.exe -> Chrome browser
        //step to invoke chrome driver
        //selenium Manager library

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashi Bhushan\\Desktop\\chrome-headless-shell-win64\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();
        driver.get("https://moeving.club/");
        driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}