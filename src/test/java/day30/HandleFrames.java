package day30;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

import java.time.Duration;

public class HandleFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        //Frame-1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);// Passed frame as a webelement  // Switch to frame1
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");

        driver.switchTo().defaultContent(); //go back to page

        //Frame -2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");

        driver.switchTo().defaultContent(); //go back to page

        //Frame -3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Register");

        //inner iframe - part of frame 3
        driver.switchTo().frame(0);
        //driver.findElement(By.xpath("//span[normalize-space()='I am a human']")).click();

        //execute frame-3 help with javascript.
        WebElement rdbutton = driver.findElement(By.xpath("//span[normalize-space()='I am a human']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", rdbutton);

        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='eBFwI']"));
        for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
        }
        //select dropdown
        WebElement valueElement = driver.findElement(By.xpath("//div[@role='option']//span[@class='vRMGwf oJeWuf']"));
        String text = valueElement.getText();
        System.out.println("Selected text: " + text);


        driver.switchTo().defaultContent(); //go back to page

        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);// Passed frame as a webelement  // Switch to frame1
        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Neha Shah");
        driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();

        //        driver.close();
    }
}
