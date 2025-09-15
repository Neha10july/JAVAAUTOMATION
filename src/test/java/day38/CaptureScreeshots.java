package day38;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class CaptureScreeshots {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //1) full page screeshot
       /* TakesScreenshot ts = (TakesScreenshot)driver;
        File sourcfile = ts.getScreenshotAs(OutputType.FILE);

        //C:\Users\Neha Shah\IdeaProjects\seleniumwebdriver
        File targefile = new File(System.getProperty("user.dir")+"\\screenshots\\img.png");
        sourcfile.renameTo(targefile); // copy source file to target file
*/
        /*//2) Capture the screenshot of specific section.
        WebElement featuredProduct = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));

        File sourcefile = featuredProduct.getScreenshotAs(OutputType.FILE);
        File targefile = new File(System.getProperty("user.dir")+ "\\screenshots\\featured.png");
        sourcefile.renameTo(targefile);// copy sourcefile to target file.
*/
        //3) Capture the screenshot of webelement.
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File source_file=logo.getScreenshotAs(OutputType.FILE);
        File targefile = new File(System.getProperty("user.dir")+ "\\screenshots\\logo.png");
        System.out.println(targefile + "It is image.");
        //driver.quit();
    }
}
