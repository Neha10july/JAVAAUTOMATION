package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleAlerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // 1. Normal alert with ok button.
       /* driver.findElement(By.xpath("(//button[normalize-space()='Click for JS Alert'])")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //driver.switchTo().alert().accept();
        Alert my_alert = driver.switchTo().alert();
        System.out.println(my_alert.getText());
        my_alert.accept();*/

        // 2. Confirmation Alert- OK & Cancel.
        /*driver.findElement(By.xpath("(//button[normalize-space()='Click for JS Confirm'])"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept(); // close alert using OK button.
        driver.switchTo().alert().dismiss();*/ // close alert using Cancel button.

        //Prompt alert - Input box
        driver.findElement(By.xpath("(//button[normalize-space()='Click for JS Prompt'])")).click();
        Alert my_prompt_alert = driver.switchTo().alert();
        my_prompt_alert.sendKeys("Welcome Neha");
        my_prompt_alert.accept();
    }
}
