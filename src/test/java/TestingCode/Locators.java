package TestingCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    // to invoke Chrome driver
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shashi Bhushan\\Downloads\\chrome-win64\\chrome-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://moeving.club/login");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id='main-content']/div/div/div/div/div/button/span"));
        loginButton.click();

    }
}
