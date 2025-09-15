package day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // ✅ FluentWait declaration
        Wait<WebDriver> mywait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))         // Total wait time
                .pollingEvery(Duration.ofSeconds(2))         // Check every 2 seconds
                .ignoring(NoSuchElementException.class);     // Ignore if element not found

        // ✅ Custom wait condition
        WebElement txt_user_name = mywait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
                if (element.isDisplayed()) {
                    return element;
                } else {
                    return null;
                }
            }
        });

        txt_user_name.sendKeys("Admin");

        // driver.quit(); // Optional
    }
}
