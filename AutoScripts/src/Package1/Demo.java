package Package1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo {

	public static void main(String[] args) throws IOException, InterruptedException {
		  WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get("http://facebook.com");
	      driver.findElement(By.name("email")).sendKeys("rusha9846@gmail.com");
	      driver.findElement(By.name("pass")).sendKeys("Usha@1234");
	      driver.findElement(By.xpath("//*[@type='submit']")).click();
	      Thread.sleep(2000);
	      TakesScreenshot ts = (TakesScreenshot)driver;
	      File srcfile = ts.getScreenshotAs(OutputType.FILE);
	      File trgfile = new File("/Users/ramesh/Documents/screenshots/sc2.jpg");

	      FileUtils.copyFile(srcfile, trgfile);

	

	}

}
