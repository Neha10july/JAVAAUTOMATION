package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class HeadlessTesting {
    public static void main(String[] args){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        String act_title = driver.getTitle();
        System.out.println("Actual Title: " + act_title);

        if (act_title.equals("nopCommerce demo store. Register")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        //driver.quit();
    }
}
