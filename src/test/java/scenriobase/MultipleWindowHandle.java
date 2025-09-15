import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;
import java.time.Duration;
import java.util.Set;

public class MultipleWindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open parent window (Facebook)
        driver.get("https://www.facebook.com/");
        String parent = driver.getWindowHandle();  // store parent handle

        // Open child window (Register page)
        driver.switchTo().newWindow(WindowType.TAB); // or WindowType.WINDOW
        driver.get("https://www.facebook.com/r.php");  // register page

        // Get all windows and switch
        Set<String> allWindows = driver.getWindowHandles();

        for (String win : allWindows) {
            if (!win.equals(parent)) {
                driver.switchTo().window(win);  // switch to child
                System.out.println("Child Title: " + driver.getTitle());
                // Perform actions on Register page
                driver.close();  // close child window
            }
        }

        // Switch back to parent
        driver.switchTo().window(parent);
        System.out.println("Back to Parent Title: " + driver.getTitle());

        driver.quit();
    }
}
