package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AssginmentHandleFrame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        //Frame-5

        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);// Passed frame as a webelement  // Switch to frame1
        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Neha Shah");

        driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();


    }
}
