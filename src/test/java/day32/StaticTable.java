package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Find total number of rows in a table.
        int rows = driver.findElements(By.xpath("(//table[@name='BookTable'])//tr")).size(); // multiple tables
       //System.out.println("Number of rows " + rows);

        //int rowss = driver.findElements(By.tagName("tr")).size(); // Single table
        //System.out.println("Number of rows " + rowss);

        //Find total number of columns in a table.
        int columns = driver.findElements(By.xpath("(//table[@name='BookTable'])//th")).size(); // multiple tables
        //System.out.println("Number of rows " + columns);

        //int cols = driver.findElements(By.tagName("th")).size(); //single table
        //System.out.println("Number of cols " + cols);

        //Read data from specific row and column (exp. 5th row and 1st column)

        //String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[4]")).getText();
        //System.out.println(bookname);

        //4) read data from all the rows and columns
        /*System.out.println("BookName" + "\t" + "Author" + "\t" + "Subject" + "\t" + "Price");

        for (int r=2; r<=rows; r++){

            for (int c=1; c<=columns; c++){

                String value = driver.findElement(By.xpath("(//table[@name='BookTable'])//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(value + "\t");
            }
            System.out.println();
        }*/

        //5) print book name whose name is mukesh.
        for (int r=2; r<=rows; r++){
            String auther_name = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();

            if (auther_name.equals("Mukesh")){
                String book_name = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(book_name+"\t"+auther_name);
            }
        }

        //6)Find total price of all the books.
        int total = 0;
        for (int r=2; r<=rows; r++){
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            total = total + Integer.parseInt(price);
        }
        System.out.println("Total price of books" + total);


        //driver.close();

    }
}
