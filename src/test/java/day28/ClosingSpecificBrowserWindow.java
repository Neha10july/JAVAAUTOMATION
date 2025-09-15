package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificBrowserWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowIDs = driver.getWindowHandles();
        for(String winID:windowIDs){

           String title =  driver.switchTo().window(winID).getTitle();
           String   url = driver.switchTo().window(winID).getCurrentUrl();
            System.out.println(title);

            if (title.equals("OrangeHRM") || title.equals("Human Resources Management Software | OrangeHRM HR Software ")){
                driver.close();
            }
        }

    }
}
