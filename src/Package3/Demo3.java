package Package3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("electric pan");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		Set<String> allwindows = driver.getWindowHandles();            
	    Object[] windows = allwindows.toArray();
	    String window1 = windows[0].toString();
	    String window2 = windows[1].toString();
	    driver.switchTo().window(window2);
	    driver.findElement(By.id("buy-now-button")).click();
	    driver.findElement(By.name("email")).sendKeys("8247425010");
	    driver.findElement(By.id("continue")).click();
	    Thread.sleep(20);
	    driver.findElement(By.id("ap_password")).sendKeys("Usha@1234");
	    driver.findElement(By.id("signInSubmit")).click();
	    Thread.sleep(20);
	    driver.findElement(By.className("a-fixed-left-grid-inner")).click();
        WebElement chkbox = driver.findElement(By.id("pp-TWvQdm-117"));
		boolean status = chkbox.isSelected();
		System.out.println(status);
		chkbox.click();
		status = chkbox.isSelected();
		System.out.println("After Selecting....");
		System.out.println(status);
		

	}

}
