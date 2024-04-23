package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

class PageLogin {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashi Bhushan\\Downloads\\chrome-win64\\chrome-win64\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();
        driver.get("https://moeving.club/login");
        driver.getTitle();
//        driver.findElement(By.className("btn_login")).click();


//        WebElement loginButton = driver.findElement(By.xpath("//*[@id='main-content']/div/div/div/div/div/button"));
//        loginButton.click();

        driver.findElement(By.cssSelector("button.btn_login")).click();

//        String[] windowHandles = null;
//        for (String windowHandle : windowHandles) {
//            // Switch to the new window
//            driver.switchTo().window(windowHandle);
//        }
//        // Now you are in the new window, perform actions as needed
//        // For example, get the title of the new window
//        String newWindowTitle = driver.getTitle();

        Set<String> windowHandlesSet = driver.getWindowHandles();
        String[] windowHandles = windowHandlesSet.toArray(new String[windowHandlesSet.size()]);

// Iterate over the window handles
        for (String windowHandle : windowHandles) {
            // Switch to the new window
            driver.switchTo().window(windowHandle);
            // Perform actions on the current window
        }


        WebElement emailbutton = driver.findElement(By.xpath("//input[@id='identifierId']"));
        emailbutton.click();
        emailbutton.sendKeys("shashi.bhushan@moeving.com");

        WebElement nextButton = driver.findElement(By.id("nextButton")); // Change "nextButton" to the actual ID of your Next button

        // Click the Next button
        nextButton.click();
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();

        WebElement passwordbutton = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        passwordbutton.click();
        passwordbutton.sendKeys("sbsmoeving1234#");


//        WebElement nextbutton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]"));
//        nextbutton.click();


    }
}
