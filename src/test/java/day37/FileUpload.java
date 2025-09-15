package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //Single file upload My Resume.txt
        /*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Neha Shah\\OneDrive\\Desktop\\My Resume.txt");

        if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("My Resume.txt")){
            System.out.println("File is successfully Uploaded.");
        }
        else {
            System.out.println("Upload Failed");
        }*/
        // Multiple file Uploaded
        String file1 = "C:\\Users\\Neha Shah\\OneDrive\\Desktop\\My Resume.txt";
        String file2 = "C:\\Users\\Neha Shah\\OneDrive\\Desktop\\My Resume.txt";

        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
        int NoofElementUploadedfile = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
        System.out.println(NoofElementUploadedfile);

        //Validation 1 - Number of files
        if (NoofElementUploadedfile == 2){
            System.out.println("All Files are Uploaded.");
        }
        else {
            System.out.println("Files are not uploaded or incorrect files uploaded");
        }

        //Validate files name

        if(driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("My Resume.txt")&&
                driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("My Resume.txt")){
            System.out.println("File name matching..");
        }
        else {
            System.out.println("Files are not matching.");
        }
    }
}
