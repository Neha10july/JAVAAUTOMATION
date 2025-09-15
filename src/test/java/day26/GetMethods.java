package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class GetMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //get(url) - Opens the URL on the Browser.

        //getTitle() - returns title of the page.
        System.out.println(driver.getTitle());

        //getCurrentUrl() - returns URL of the page.
        System.out.println(driver.getCurrentUrl());

        //getPageSource() - returns source code of the page.
        System.out.println(driver.getPageSource());

        //getWindowHandle() - return ID of the single browser window.
        String WindowId = driver.getWindowHandle();
        System.out.println(WindowId);

        //getWindowHandles() - return ID's of the multiple browser windows.
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();// THis will opens new window.
        Set<String> WindowIDs = driver.getWindowHandles();
        System.out.println(WindowIDs);//


    }
}
