package day36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TabsAndWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");

        //Selenium4.x for new tab
        driver.switchTo().newWindow(WindowType.TAB); //open new tab

        //driver.switchTo().newWindow(WindowType.WINDOW); // open new window
        driver.get("https://orangehrm.com/");
    }
}
