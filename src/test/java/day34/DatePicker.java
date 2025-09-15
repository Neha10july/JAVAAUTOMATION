package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePicker {

    //Select future date
    static void selectFutureDate(WebDriver driver, String year, String month,String date) {
        //Select month & year
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Previous
        }
        List<WebElement> all_dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));

        for (WebElement dt : all_dates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    //Select past date
    static void selectPastDate(WebDriver driver, String year, String month,String date) {
        //Select month & year
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Previous
        }
        List<WebElement> all_dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));

        for (WebElement dt : all_dates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

/*    static void selectMonthAndYear(WebDriver driver, String month, String year){
        //Select month & year
        while (true){
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Previous
        }

    }

    static void selectDate(WebDriver driver, String date){
        //select the date
        List<WebElement> all_dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));

        for (WebElement dt:all_dates){
            if(dt.getText().equals(date)){
                dt.click();
                break;
            }
        }
    }*/
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        //Switch to frame.
        driver.switchTo().frame(0);

        //Method1 using sendkeys()
        //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024"); //mm//dd//yyyy

        //Method2 Using date Picker
        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //open date picker
        //Expected Data
        String year = "2021";
        String month = "May";
        String date = "10";
        //selectMonthAndYear(driver,month,year);
        //selectDate(driver,date);
        //selectFutureDate(driver,year,month,date);
        selectPastDate(driver,year,month,date);

    }
}
