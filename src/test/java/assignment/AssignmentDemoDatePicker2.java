package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class AssignmentDemoDatePicker2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Radha Gupta");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rg@gmail.com");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8160798609");
        driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Mehak Eco City G.B. Nager");

        driver.findElement(By.xpath("(//label[normalize-space()='Female'])")).click();

        List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
        for (int i = 0; i < checkboxs.size(); i++) {
            checkboxs.get(i).click();
        }


        WebElement states = driver.findElement(By.xpath("//select[@id='country']"));
        Select state_sl = new Select(states);

        for (WebElement state:state_sl.getOptions()){
            if (state.getText().equals("India")){
                state.click();
                break;
            }
        }

        WebElement colours = driver.findElement(By.xpath("//select[@id='colors']"));
        Select colour_sl = new Select(colours);

        for (WebElement colour:colour_sl.getOptions()){
            if (colour.getText().equals("Red")){
                colour.click();
                break;
            }
        }

        WebElement sort_lists = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sort_sl = new Select(sort_lists);

        for (WebElement sort:sort_sl.getOptions()){
            if (sort.getText().equals("Cheetah")) {
                sort.click();
                break;
            }
        }
        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //open date picker
        //Expected Data
        String year = "2021";
        String month = "May";
        String date = "10";

    }
}
