package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AssignmentDatePicker {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.railyatri.in/train-ticket");
        driver.manage().window().maximize();

        // Step 1: Type in the 'From Station'
        driver.findElement(By.id("fromstation")).sendKeys("DENDULURU | DEL");
        driver.findElement(By.id("tostation")).sendKeys("DEBAGRAM | DEB");
        // Step 2: Wait for suggestions to load
        Thread.sleep(2000);

        // Step 3: Fetch all suggestions using correct XPath
        List<WebElement> list = driver.findElements(By.xpath("//input[contains(@class,'ui-autocomplete')]/li"));

        System.out.println("Total suggestions: " + list.size());

        // Step 4: Loop and click matching station
        for (WebElement station : list) {
            if (station.getText().contains("DENDULURU | DEL")) {
                station.click();
                break;
            }
        }

        WebElement dateInput = driver.findElement(By.xpath("//img[@alt='cal icon']"));
        dateInput.click();

        String targetMonthYear = "August 2025";
        String targetDay = "18";

        while (true) {
            String currentMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
            if (currentMonthYear.equals(targetMonthYear)) {
                break;
            }
            driver.findElement(By.xpath("//a[@title='Next']")).click();
        }

        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]"));
        for (WebElement day : days) {
            if (day.getText().equals(targetDay)) {
                day.click();
                break;
            }
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
