package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();

        // Open the main page
        driver.get("https://demo.nopcommerce.com/");

        // Navigate to another page
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Using URL object
        //URL my_url = new URL("https://demo.nopcommerce.com/");
        //driver.navigate().to(my_url);  // navigate using URL object

        // Navigate to same site again
        //driver.navigate().to("https://demo.nopcommerce.com/");

        // Optional: Navigate back, forward, refresh
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();

        // Close the browser
       // driver.quit();
    }
}
