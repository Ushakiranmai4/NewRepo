package Myntra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/ramesh/Documents/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//*[@id=\"header-search-icon\"]/svg")).click();
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("tops");
		
	}
	
	public void newMethod() {
//		System.out.
	}
	
	
}
