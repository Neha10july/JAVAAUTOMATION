package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BjsSearch_AutoSuggestDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try {
            Thread.sleep(5000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://www.bjs.com");
        driver.manage().window().maximize();
        try {
            Thread.sleep(5000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[@placeholder='What are you looking for today?']")).sendKeys("water");

        List<WebElement> list = driver.findElements(By.xpath("(//div[@class='list-item border-0 list-group-item'])"));
        System.out.println(list.size());

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i).getText());

            if (list.get(i).getText().equals("water")){
                list.get(i).click();
                break;

            }
        }

    }
}
