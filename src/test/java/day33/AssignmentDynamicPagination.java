package day33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AssignmentDynamicPagination {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String text = driver.findElement(By.xpath("//h2[normalize-space()='Pagination Web Table']")).getText();
        System.out.println("Table text display " + text);

        List<WebElement> pageLinks = driver.findElements(By.xpath("//ul[@class='pagination']//li//a"));
        int totalPages = pageLinks.size();
        System.out.println("Total Pages: " + totalPages);


        int no_of_rows = driver.findElements(By.xpath("//table[@id='productTable']//td")).size();
        System.out.println("No of rows" + no_of_rows);

        for (int r = 1; r <=no_of_rows ; r++) {
            String id = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]/td[1]")).getText();
            String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]/td[2]")).getText();
            String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]/td[3]")).getText();
            WebElement checkbox = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]/td[4]//input[@type='checkbox']"));
            checkbox.click();

            System.out.println(id + "\t" + name + "\t" + price + "\tSelected");
        }
        driver.quit();
    }
}
