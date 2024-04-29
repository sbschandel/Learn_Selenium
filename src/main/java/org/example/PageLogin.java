package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;
class PageLogin {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Shashi Bhushan\\Desktop\\chrome-win64\\chrome-win64\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://moeving.club/login");
        driver.getTitle();

        driver.findElement(By.className("btn_login")).click();
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='main-content']/div/div/div/div/div/button"));
        loginButton.click();

        //driver.findElement(By.cssSelector("button.btn_login")).click();

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

        WebElement nextButton = driver.findElement(By.xpath("//div[@id='identifierNext']"));
        nextButton.click();

        //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[3]")).click();
        WebElement passwordbutton = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        passwordbutton.click();
        passwordbutton.sendKeys("sbsmoeving1234#");

        WebElement loginnextButton = driver.findElement(By.xpath("//div[@id='passwordNext']"));
        loginnextButton.click();

    }
}
