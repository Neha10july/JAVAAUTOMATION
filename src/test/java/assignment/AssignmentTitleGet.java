package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AssignmentTitleGet {
    public static void main(String[] args) {
        WebDriver driver  = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.demo.guru99.com/V4/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("uid"));
        username.sendKeys("mngr630810");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("adatYdY");

        driver.findElement(By.name("btnLogin")).click();
        //driver.findElement(By.xpath("//input[@name='btnReset']")).click();

        String title = driver.getTitle();
        if (title.equals("Guru99 Bank Manager HomePage")) {
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }

        //driver.close();
    }
}
