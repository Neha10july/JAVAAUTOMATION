package day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelectors {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        ///html/body/div[6]/div[1]/div[2]/div[2]/form/input
        ////*[@id="small-searchterms"]
        ///html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/select[1]

        driver.manage().window().maximize();
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");

        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Computer");

        //tag attribute     tag[attribute='value']
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
        //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Electronics");

        //tag class attribute
        //driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("");
        driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-shirts");

    }
}
