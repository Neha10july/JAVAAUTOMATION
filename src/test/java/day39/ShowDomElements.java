package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShowDomElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();
        // This Element is inside Shadow DOM.
        /*String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
        SearchContext shadow = driver.findElement(By.cssSelector("book-app[@apptitle='BOOKS']")).getShadowRoot();
       */

        driver.findElement(By.cssSelector("#input")).sendKeys("Welcome India");
    }
}
