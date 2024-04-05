package Booking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TicketBooking
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get("https://ttdevasthanams.ap.gov.in/home/dashboard");
	      driver.findElement(By.linkText("click here")).click();
	      driver.findElement(By.xpath("//*[@type='text']")).sendKeys("8973173641");
	      driver.findElement(By.xpath("//*[@type='submit']")).click();
	      
	      driver.findElement(By.xpath("//*[@type='submit']")).click();
	      Thread.sleep(300000);
	      driver.findElement(By.xpath("//*[@value='1800']")).click();
	      WebElement number= driver.findElement(By.xpath("//*[@role='menu']"));
	      Select persons=new Select(number);
	      persons.selectByVisibleText("4");
	      
	   
	      
	}

}
