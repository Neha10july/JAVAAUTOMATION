package day45;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class DataProviderDemo {

    WebDriver driver;

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test(dataProvider = "dp")
    void testlogin(String email, String pwd)throws InterruptedException{
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){

        }
        boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
        if (status==true){
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            Assert.assertTrue(true);
        }
        else {
            Assert.fail();
        }

    }

    @AfterClass
    void terdown(){
        driver.close();
    }

    @DataProvider(name="dp",indices = {0,3,4})
    Object[][] loginData(){
        Object data [][] = {
                {"abc@gmail.com", "test123"},
                {"xyz@gmail.com", "test012"},
                {"john@gmail.com", "test@123"},
                {"nehabansal10july@gmail.com", "$5Sep1988"},
                {"abc@gmail.com", "test"},
        };
        return data;
    }

}


