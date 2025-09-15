package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RegisterPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com/r.php?entry_point=login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Neha");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shah");

        WebElement day_select = driver.findElement(By.id("day"));
        Select day_sl = new Select(day_select);

        for (WebElement day : day_sl.getOptions()) {
            if (day.getText().equals("10")) {
                day.click();
                break;
            }
        }

        WebElement month_select = driver.findElement(By.id("month"));
        Select month_sl = new Select(month_select);

        for (WebElement month : month_sl.getOptions()) {
            if (month.getText().equals("Jul")) {
                month.click();
                break;
            }
        }

        WebElement year_select = driver.findElement(By.id("year"));
        Select year_sl = new Select(year_select);

        for (WebElement year : year_sl.getOptions()) {
            if (year.getText().equals("1988")) {
                year.click();
                break;
            }
        }
        try {
            Thread.sleep(2000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();

        driver.findElement(By.name("reg_email__")).sendKeys("nehabansal10july@gmail.com");

        try {
            Thread.sleep(2000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.name("reg_passwd__")).sendKeys("1@Aug2025");

        try {
            Thread.sleep(2000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.name("websubmit")).click();


        driver.findElement(By.xpath("//a[@aria-label='Already have an account?']")).click();

        WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
        Email.sendKeys("nehabansal10july@gmail.com");
        WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
        Password.sendKeys("1@Aug2025");

        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

         try {
            Thread.sleep(3000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[@id='code_in_cliff']")).sendKeys("06739");
        driver.findElement(By.xpath("//a[normalize-space()='Send Email Again']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='OK']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Update Contact Info']")).click();
        driver.findElement(By.name("contactpoint")).sendKeys("8160798609");
        try {
            Thread.sleep(3000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//a[normalize-space()='Cancel']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();

        driver.close();
    }
}
