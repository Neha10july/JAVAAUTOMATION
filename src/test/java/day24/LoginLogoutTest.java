package day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class LoginLogoutTest {

    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to website
        driver.get("https:/my.iq-india.com/authlogin/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Locate and fill username
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("_TextBoxUser"))); // Change ID if needed
        username.sendKeys("8160798609");

        // Locate and fill password
        WebElement password = driver.findElement(By.name("_TextBoxPWD")); // Change ID if needed
        password.sendKeys("12345678");

        // Click login button
        WebElement loginBtn = driver.findElement(By.id("ButtonSign")); // Change ID if needed
        loginBtn.click();

        // Optional: wait for dashboard or home page element
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dashboard"))); // Use actual element ID

        System.out.println("Login successful.");

        WebElement profileImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*img//*[@id=\"drop2\"])"))); // Adjust as needed
        profileImage.click();


        // Perform logout
        WebElement logoutBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutButton"))); // Use actual ID
        logoutBtn.click();

        System.out.println("Logout successful.");

        // Close browser
        driver.quit();
    }
}

