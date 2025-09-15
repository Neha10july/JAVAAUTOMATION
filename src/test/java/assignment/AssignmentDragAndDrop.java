package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class AssignmentDragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();;

        Actions act = new Actions(driver);

        WebElement bank_drag = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
        WebElement bank_drop = driver.findElement(By.xpath("//ol[@id='bank']"));

        act.dragAndDrop(bank_drag,bank_drop).perform();
        try {
            Thread.sleep(5000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement bank_drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'][normalize-space()='5000'])[2]"));

        WebElement bank_drop1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
        act.dragAndDrop(bank_drag1,bank_drop1).build().perform();

        WebElement sales = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
        WebElement credit_bank = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));

        act.dragAndDrop(sales,credit_bank).build().perform();

        WebElement sales_amt = driver.findElement(By.xpath("(//a[@class='button button-orange'][normalize-space()='5000'])[2]"));
        WebElement credit_bank_amt = driver.findElement(By.xpath("//ol[@id='amt8']"));

        act.dragAndDrop(sales_amt,credit_bank_amt).build().perform();

    }
}
