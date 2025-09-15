package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //1) Scroll down page by pixel number.
       /* js.executeScript("window.scrollBy(0,1500)", "");
        System.out.println(js.executeScript("return window.pageYOffset;")); //1500*/

        //2) Scroll the page till element is visible.
        /*WebElement ele =driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
        js.executeScript("arguments[0].scrollIntoView();",ele);
        System.out.println(js.executeScript("return window.pageYOffset;")); //2411.199951171875*/

        //3) Scroll page till end of the page.
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));//2411.199951171875

        driver.findElement(By.xpath("//button[@id='vote-poll-1']")).click();

    }
}
