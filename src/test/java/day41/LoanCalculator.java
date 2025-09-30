package day41;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class LoanCalculator {
    public static void main(String[] args)  throws IOException{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://cleartax.in/s/simple-compound-interest-calculator");

        driver.manage().window().maximize();

        String filepath = "C:\\Users\\Neha Shah\\IdeaProjects\\seleniumwebdriver\\testdata\\bank_interests.xlsx";

        int rows = ExcelUtils.getRowCount(filepath,"Sheet1");

        for (int i = 1; i <=rows ; i++) {
            // 1) Read data from Excel.
            String pric = ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
            String rateofintrest = ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
            String per1 = ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
            String per2 = ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
            String fre = ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
            String mv = ExcelUtils.getCellData(filepath, "Sheet1", i, 5);

            //2) Pass data above into application
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.findElement(By.xpath("//input[@id='input_investmentOption_0']")).click();
            driver.findElement(By.xpath("//input[@id='principleAmount']")).clear();
            driver.findElement(By.xpath("//input[@id='principleAmount']")).sendKeys(pric);
            WebElement principalInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='principleAmount']")));

            // Clear the input
            principalInput.clear();
            driver.findElement(By.xpath("//input[@id='annualrate']")).sendKeys(rateofintrest);
            driver.findElement(By.xpath("//select[@id='periodUnit']")).clear();
            WebElement periodUnit = driver.findElement(By.id("periodUnit"));

// Use Select class
            Select select = new Select(periodUnit);
            select.selectByVisibleText("Years"); // or selectByValue("years")
            driver.findElement(By.xpath("//input[@id='periodInDigit']")).clear();
            driver.findElement(By.xpath("//input[@id='periodInDigit']")).sendKeys(per2);

            //Validation
            String act_value = driver.findElement(By.xpath("//span[normalize-space()='10,083.33']")).getText();
            if (Double.parseDouble(mv) == Double.parseDouble(act_value)){
                System.out.println("Test Passed");
                ExcelUtils.setCellData(filepath, "Sheet1",i,7 ,"Passed");
                ExcelUtils.fillRedColor(filepath, "Sheet1", i,7);
            }
            else {
                System.out.println("Test Failed");
                ExcelUtils.setCellData(filepath, "Sheet1" , i,7, "Failed");
                ExcelUtils.fillRedColor(filepath, "Sheet1",i, 7);
            }
            try {
                Thread.sleep(3000); // Better to use explicit wait in real projects
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
