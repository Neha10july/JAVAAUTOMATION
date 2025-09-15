package day25;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();

        //Self -Selects the current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'KIOCL')]/self::a")).getText();
        System.out.println("Self : " + text);//KIOCL

        //Parent -Select the parent of the current code(always one)
        text = driver.findElement(By.xpath("//a[contains(text(), 'KIOCL']/parent::td")).getText();

    }
}
