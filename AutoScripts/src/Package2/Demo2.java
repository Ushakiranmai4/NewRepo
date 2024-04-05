package Package2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/ramesh/Documents/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");
		
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.partialLinkText("Bookings")).click();
		
		driver.findElement(By.partialLinkText("Delete")).click();	
		WebDriverWait x=new WebDriverWait(driver, 10);
		x.until(ExpectedConditions.alertIsPresent());
		String y=driver.switchTo().alert().getText();
		System.out.println(y);
		

	}

}
