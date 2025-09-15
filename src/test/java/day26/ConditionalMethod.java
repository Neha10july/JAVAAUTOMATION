package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        //isDisplay() -
        //WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        //System.out.println("Display Status Logo = " + logo.isDisplayed());

        //boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        //System.out.println(status);

        //isEnabled()
        boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println("Enabled Status = : " + status);

        //isSelected()
        WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println("Before Selction ======:");
        System.out.println(male_rd.isSelected());//false
        System.out.println(female_rd.isSelected());//false
        male_rd.click(); // select male radio button

        System.out.println("After Selction male ======:");
        System.out.println(male_rd.isSelected());//true
        System.out.println(female_rd.isSelected());//false

        System.out.println("After Selction female ======:");
        female_rd.click();
        System.out.println(female_rd.isSelected());//false
        System.out.println(female_rd.isSelected());//true

        boolean news_letter_status = driver.findElement(By.xpath(" //input[@id='Newsletter']")).isSelected();
        System.out.println("News letter check box status =:" +news_letter_status);

    }

}
