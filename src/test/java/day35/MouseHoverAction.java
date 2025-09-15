package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHoverAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://spu.ac.in");
        driver.manage().window().maximize();

        WebElement desktops = driver.findElement(By.xpath("//div[@class='top-bar-menu']//a[@class='sf-with-ul-pre sf-with-ul'][normalize-space()='Achievements']"));
        WebElement mac = driver.findElement(By.xpath("//div[@class='top-bar-menu']//a[contains(text(),'Presidential Awards')]"));

        Actions act = new Actions(driver);

        act.moveToElement(desktops).moveToElement(mac).click().build().perform();
        driver.close();

    }
}
