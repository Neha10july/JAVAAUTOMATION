package day29;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//Handle alert without using switchTo().alert()
//By using explicit wait.
public class HandleAlertUsingExplicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//button[normalize-space()='Click for JS Alert'])")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Alert my_alert = mywait.until(ExpectedConditions.alertIsPresent()); //capture alert
        System.out.println(my_alert.getText());
        my_alert.accept();
    }
}
