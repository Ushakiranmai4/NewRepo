package Package5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCart
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/ramesh/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://flipkart.com");
		
		driver.findElement(By.className("Pke_EE")).sendKeys("watches for women");
		
		
		driver.findElement(By.id("add-to-cart-button")).click();
	}
}
	
	
