package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPathDemo {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //Handle dropdown
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option1");

        //Handle Checkbox
        WebElement cb = driver.findElement(By.id("Check1"));
        if (!cb.isSelected()){
            cb.click();
        }

        //Xpath with single attributes


        //driver.findElement(By.xpath("//input[@placeholder='Search Store']")).sendKeys("TShirts");

        //Xpath with multiple attribute

        //driver.findElement(By.xpath("//input[@id='small-searchterms'][@id='small-searchterms']")).sendKeys("i phone 16");

        // xpath with 'and'operator
        //driver.findElement(By.xpath("//input[@id='small-searchterms' and @id='small-searchterms']")).sendKeys("T-shirts");

        //xpath with 'or' operator
        //driver.findElement(By.xpath("//input[@id='small-searchterms' or @id='small-searchterms']")).sendKeys("Jeans");

        //xpath with text() - inner text
       // boolean displaystatus=driver.findElement(By.xpath("//*[text()='Featured products']")).isDisplayed();
        //System.out.println(displaystatus);
       // String value = driver.findElement(By.xpath("//strong[text()='Featured products']")).getText();
        //System.out.println(value);

        //Xpath with contains
        //driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-Shirts");
       // driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-Shirts");

        //Chained xpath
        boolean image_status = driver.findElement(By.xpath("//*[@class='header-logo']/a/img")).isDisplayed();
        System.out.println(image_status);

    }
}
