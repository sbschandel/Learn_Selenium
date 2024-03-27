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
        int [] arr = new  int[5];
        arr [0]  = 1;
        arr [1]  = 2;
        arr [2]  = 3;
        arr [3]  = 4;
        arr [4]  = 7;

        int [] arr2 = {1,2,3,4,7};
        System.out.println(arr2[2]);

    }
}