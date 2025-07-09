package day22;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LocatorsDemo {
	public static void main(String[] args) {
		
		WebDriver driver= new  ChromeDriver();
		
		driver.get("https://ion.ics-global.in//");
		driver.manage().window().maximize();
		
//		//name
//		driver.findElement(By.name("q")).sendKeys("Laptop");
		
//		boolean logoDisplayStatus = driver.findElement(By.id("top_menu_container")).isDisplayed();
//		System.out.println(logoDisplayStatus);
//		
		//linktext & Partiallinktext
		//driver.findElement(By.linkText("Select Country")).click();
		//driver.findElement(By.partList<A>inkText("Country")).click();
		
		//className
		//List<WebElement> topheader = driver.findElements(By.className("nav-item"));
		//System.out.println("Total number of header links " + topheader.size());		
		
		//tagname
		//List<WebElement>  links = driver.findElements(By.tagName("a"));
		//System.out.println("Total number of links" + links.size() );
		
		List<WebElement>  images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of Images" + images.size() );
		
	}

}