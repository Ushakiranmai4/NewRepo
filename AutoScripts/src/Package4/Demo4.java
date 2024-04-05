package Package4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com");		
		
		driver.findElement(By.linkText("Register")).click();
				
		WebElement chkbox = driver.findElement(By.id("flexCheckChecked"));
		
		boolean status = chkbox.isSelected();
		System.out.println(status);
		
		chkbox.click();
		status = chkbox.isSelected();
		System.out.println("After Selecting....");
		System.out.println(status);

	}

}
