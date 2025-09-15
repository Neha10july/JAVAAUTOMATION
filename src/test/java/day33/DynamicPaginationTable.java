package day33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicPaginationTable {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://datatables.net/examples/basic_init/alt_pagination.html");
        driver.manage().window().maximize();

        // Wait until table rows are loaded
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#example tbody tr")));

        // Get the "Showing x to y of z entries" text
        String text = driver.findElement(By.id("example_info")).getText();
        System.out.println("Info Text: " + text); // e.g., "Showing 1 to 10 of 57 entries"

        // Split the text by spaces
        String[] parts = text.split(" ");

        // The number after "of" will be at index 5 (0-based)
        int totalEntries = Integer.parseInt(parts[5]);
        System.out.println("Total entries: " + totalEntries);

        // Calculate total pages (10 entries per page in this example)
        int totalPages = (int) Math.ceil(totalEntries / 10.0);
        System.out.println("Total pages: " + totalPages);

        for (int p = 0; p <=5 ; p++) {

            if (p>1){
                WebElement active_page = driver.findElement(By.xpath("//button[normalize-space()="+p+"]"));
                active_page.click();
                try {
                    Thread.sleep(5000); // Better to use explicit wait in real projects
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //reading data from the page
            int no_of_rows = driver.findElements(By.xpath("//table[@id='example']//tbody//td")).size();
            for (int r = 1; r <=no_of_rows ; r++) {
                String name = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+r+"]/td[1]")).getText();

                String position = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+r+"]/td[2]")).getText();

                String Extn = driver.findElement(By.xpath("//table[@id='example']//tbody//tr[\"+r+\"]/td[3]")).getText();
                System.out.println(name + "\t" + position + "\t" + Extn);
            }
        }

        //driver.quit();
    }
}
