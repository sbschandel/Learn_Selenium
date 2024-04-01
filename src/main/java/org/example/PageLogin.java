package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class PageLogin {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashi Bhushan\\Downloads\\chrome-win64\\chrome-win64\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();
        driver.get("https://moeving.club/");
        driver.getTitle();

        WebElement loginButton = driver.findElement(By.xpath("//*[@id='main-content']/div/div/div/div/div/button/span"));
        loginButton.click();

        String[] windowHandles = null;
        for (String windowHandle : windowHandles) {
            // Switch to the new window
            driver.switchTo().window(windowHandle);
        }
        // Now you are in the new window, perform actions as needed
        // For example, get the title of the new window
        String newWindowTitle = driver.getTitle();

        WebElement emailbutton = driver.findElement(By.xpath("//input[@id='identifierId']"));
        emailbutton.click();
        emailbutton.sendKeys("shashi.bhushan@moeving.com");

    }
}
