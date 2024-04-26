package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLoginCase {
    public static void main (String[] args){

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Shashi Bhushan\\Desktop\\chrome-win64\\chrome-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://moeving.club/login");

        //some getCommands

        String pageTitle = driver.getTitle();
        System.out.println("Page Title :" + pageTitle);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL :" + currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println("Page Source :" + pageSource);












    }
}
