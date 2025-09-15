package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCountry = new Select(drpCountryEle);

        //Select option from the dropdown.
        //drpCountry.selectByValue("japan");
        //drpCountry.selectByVisibleText("France");
        drpCountry.selectByIndex(2);

        //capture the options from the dropdown.

       List<WebElement> options =  drpCountry.getOptions();
       System.out.println("Number the option in the dropdown:" + options.size());//10

        //Printing the options
      /* for (int i = 0; i<options.size(); i++){
           System.out.println(options.get(i).getText());
       }*/

        //enchanced for loop
        for (WebElement op:options){
            System.out.println(op.getText());
        }
       // driver.close();
    }
}
