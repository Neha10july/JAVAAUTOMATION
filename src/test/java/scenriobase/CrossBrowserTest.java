package scenriobase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowserTest {
    public static void main(String[] args) {
        // Suppose client gives browser name as input
        String browser = "firefox";   // can be "chrome", "firefox", or "edge"

        WebDriver driver = null;

        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Invalid browser name!");
                return; // exit program if invalid browser
        }

        driver.get("https://flipkart.com");
        System.out.println("Title is: " + driver.getTitle());

        driver.quit();
    }
}