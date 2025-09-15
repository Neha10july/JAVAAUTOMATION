package scenriobase;
/*The username field accepts only alphabets, and the password must
be masked (hidden).

How will you automate this validation?

What if the login button is not clickable sometimes?*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginPage {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));

        email.clear();
        email.sendKeys("nehabansal5Sep@gmail.com");

        email.clear();
        email.sendKeys("nehabansal5sepgmail.com");



    }
}
