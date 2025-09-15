package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

/*
1) Link    href="https//xyz.com"
2) https://xyz.com---> server ---> status code
3) status code>=400 broken link
status code < 400 not a broken link
*/

public class BrokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links = " + links.size() );
        int noofBrokenlink=0;
        for (WebElement linkElement:links){
            String hrefattvalue = linkElement.getAttribute("href");

            if (hrefattvalue == null || hrefattvalue.isEmpty()){
                System.out.println("href attribute value is null or empty. So Not Possible to check");
                continue;
            }
            try {
                //hit url to the server
                URL linkUrl = new URL(hrefattvalue); //converted href value from string  to URL format
                HttpURLConnection conn = (HttpURLConnection) linkUrl.openConnection(); //open connection to the server
                conn.connect();
                if (conn.getResponseCode()>=400){
                    System.out.println(hrefattvalue+ "======>Broken Link");
                    noofBrokenlink++;

                }
                else {
                    System.out.println(hrefattvalue + "====>Not a broken Link");
                }
            }catch (Exception e){

            }

        }
        System.out.println("Number of broken links: " + noofBrokenlink);
    }
}
