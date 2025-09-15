package day28;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowsIds = driver.getWindowHandles();

        //Approach 1
        List<String> window_List = new ArrayList<>(windowsIds);

        String parentID = window_List.get(0);
        String childID = window_List.get(1);

        //Switch to child window
        driver.switchTo().window(childID);
        System.out.println(driver.getTitle());

        //Switch to parent window
        driver.switchTo().window(parentID);
        System.out.println(driver.getTitle());

        //Approach 2
        for (String winId:windowsIds) {
            String title = driver.switchTo().window(winId).getTitle();
            if (title.equals("OrangeHRM")){
                System.out.println(driver.getCurrentUrl());
                //some validation  on the parent window
            }
        }


    }
}
