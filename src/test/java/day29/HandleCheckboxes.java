package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckboxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //Selected specific checkbox

        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //select the all checkboxes.1 approach
        List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
//        for (int i = 0; i < checkboxs.size(); i++) {
//            checkboxs.get(i).click();
//        }

        //select the all checkboxes.2 approach
        /*for(WebElement checkbox:checkboxs){
            checkbox.click();
        }*/

        // select last three checkboxes.
        //total no of checkboxes-how many checkboxes want to select= starting index
        //7-3=4(starting index)

        /*for (int i = 4; i <checkboxs.size() ; i++) {
            checkboxs.get(i).click();
        }*/


        //Select first three check boxes
        /*for (int i = 0; i <3 ; i++) {
            checkboxs.get(i).click();
        }*/

        //Unselected checkboxes if they they are selected.
        for (int i = 0; i <3 ; i++) {
            checkboxs.get(i).click();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <checkboxs.size() ; i++) {
            if (checkboxs.get(i).isSelected()){
            checkboxs.get(i).click();
        }
        }
    driver.close();


    }
}
