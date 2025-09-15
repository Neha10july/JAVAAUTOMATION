package day37;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) {
        //WebDriver driver  = new ChromeDriver();

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();
        WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));

        //passing the text into inbox - alternate of sendkeys()
        JavascriptExecutor js = (JavascriptExecutor)driver; //JavaScriptExecutor js = driver;
        js.executeScript("arguments[0].setAttribute('value','John')",inputbox);

        WebElement radiobtn = driver.findElement(By.xpath("//input[@id='female']"));
        js.executeScript("arguments[0].click()",radiobtn);
    }
}
