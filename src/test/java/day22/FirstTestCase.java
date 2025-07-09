package day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
Test case 
-----
1) Launch browser (chrome)
2) Open URL https:demo.opencart.com/
3)Validate title should be  "Your Store"
4)Close browser
*/

public class FirstTestCase {
	public static void main(String[] args) {
		
//		1) Launch browser (chrome)
//		ChromeDriver driver  = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		
		//2) Open URL https:demo.opencart.com/
		driver.get("https://rishidemos.com/minimal-agency/");
		
		//3)Validate title should be  "Your Store"
		String act_title = driver.getTitle();
		
		if (act_title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//4 Close browser
//	driver.close();
		//driver.quit();
	}

}