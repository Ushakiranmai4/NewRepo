package Package5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart
{	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/ramesh/Documents/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://amazon.com");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches for women");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.get("https://www.amazon.in/Titan-Raga-Analog-Womens-Watch-2606WM07/dp/B08HCJ12QY/ref=sr_1_5?keywords=watches+for+women&qid=1702473700&s=apparel&sr=1-5");
		
		//driver.findElement(By.className("s-image")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"a-size-base-plus a-color-base a-text-normal\"])[6]")).click();
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		
	}

}
