package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AssignmentDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='input_1_1']")).sendKeys("nehashah5sep@gmail.com");
        driver.findElement(By.xpath("//input[@id='input_1_3_3']")).sendKeys("Neha");
        driver.findElement(By.xpath("//input[@id='input_1_3_6']")).sendKeys("Shah");
        driver.findElement(By.xpath("//input[@id='input_1_4']")).sendKeys("8160798609");
        driver.findElement(By.xpath("//input[@id='input_1_5']")).sendKeys("QA Engineer");
        driver.findElement(By.xpath("//input[@id='input_1_6']")).sendKeys("BioTax AI Pvt. Ltd.");
        WebElement ddown = driver.findElement(By.name("input_8"));
        Select select = new Select(ddown);

        select.selectByValue("level-1");
        select.selectByVisibleText("251 - 500 employees");
        select.selectByIndex(5);

       
    }
}
