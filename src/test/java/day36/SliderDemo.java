package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Optional;

public class SliderDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        System.out.println("Location of the in slider "+ min_slider.getLocation());//(58,249) = (X,Y)
        act.dragAndDropBy(min_slider,100,249).perform();
        System.out.println("Location of the min slider after moving:" +min_slider.getLocation());

        WebElement max_slider = driver.findElement(By.xpath("div[id='slider-range'] span:nth-child(2)"));
        System.out.println("Default Location of the max slider :" + max_slider.getLocation());//(876,249)
        act.dragAndDropBy(min_slider, -100,249).perform();
        System.out.println("Location of the max slider after moving :"+max_slider.getLocation());

        driver.close();
    }
}
