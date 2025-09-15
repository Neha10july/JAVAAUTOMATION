package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropAction {
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));

        act.dragAndDrop(drag,drop).perform();
    }

}
