package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAlert {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://mypage.rediff.com/login/dologin");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Alert my_alert = driver.switchTo().alert();
        System.out.println(my_alert.getText());
        my_alert.accept();
    }
}
