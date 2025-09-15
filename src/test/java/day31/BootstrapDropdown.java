package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://admissions.spu.ac.in/application-form");
        driver.manage().window().maximize();

        //Select Single option
        driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Neha Shah");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("nehabansal5sep@gmail.com");

        WebElement dropdownButton = driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle as-is bs-dropdown-to-select']"));
        dropdownButton.click();

        // Wait a bit and then select an option (example: "India")
        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu inner selectpicker']/li/a/span[2]"));
        dropdownButton.click();

        for (WebElement option : options) {
            if (option.getText().equals("India")) {
                option.click();
                break;
            }
        }
        driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("8160798609");
        //select state
        WebElement state_select = driver.findElement(By.xpath("//select[@id='StateId']"));
        Select state_sl = new Select(state_select);

        List<WebElement> stateOptions = state_sl.getOptions();
        for (WebElement state : stateOptions) {
            if (state.getText().equals("Gujarat")) {
                state.click();
                break;
            }
        }

        try {
            Thread.sleep(2000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

// Now get city dropdown again
        WebElement city_select = driver.findElement(By.id("CityId"));
        Select city_sl = new Select(city_select);

        for (WebElement city : city_sl.getOptions()) {
            if (city.getText().equals("Anand")) {
                city.click();
                break;
            }
        }

        try {
            Thread.sleep(3000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Now get city dropdown again
        WebElement course_select = driver.findElement(By.id("CourseId"));
        Select course_sl = new Select(course_select);

        for (WebElement course : course_sl.getOptions()) {
            if (course.getText().equals("Science")) {
                course.click();
                break;
            }
        }

        //Select Course
        try {
            Thread.sleep(2000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Now get city dropdown again
        WebElement specialzation = driver.findElement(By.id("SpecializationId"));
        Select specialzation_sl = new Select(specialzation);

        for (WebElement specialzat : specialzation_sl.getOptions()) {
            if (specialzat.getText().equals("B.Sc. Biotechnology")) {
                specialzat.click();
                break;
            }
        }

        try {
            Thread.sleep(2000); // Better to use explicit wait in real projects
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement captchaImg = driver.findElement(By.xpath("//img[contains(@src, '/application-form/captcha')]"));
        if (captchaImg.isDisplayed()) {
            System.out.println("CAPTCHA is visible");
        }
        WebElement refresh = driver.findElement(By.cssSelector(".beforeCImage_new")); // Use actual locator
        refresh.click();

        // 3. Enter dummy CAPTCHA
        WebElement input = driver.findElement(By.id("69355633")); // Use actual locator
        input.sendKeys("a8b946"); // You can replace with OCR result

    }
}
