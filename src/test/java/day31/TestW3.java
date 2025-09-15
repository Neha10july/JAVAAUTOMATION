package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestW3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id='navbtn_certified']")).click();
        driver.findElement(By.xpath("//a[@title='Paid HTML Course']")).click();
    }
}
