package pkg1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/Admin/Customer/List");
		driver.findElement(By.xpath("//*[@type='email']")).clear();
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.xpath("//*[@type='password']")).clear();
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		takess(driver, "checkbox");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//*[@id='SearchMonthOfBirth']"));
		
		WebElement day = driver.findElement(By.xpath("//*[@id='SearchDayOfBirth']"));
		Select dd =new Select(month);
		dd.selectByIndex(12);
		Select dm = new Select(day);
		dm.selectByIndex(10);
		driver.close();

	}
	public static void takess(WebDriver driver, String nameofthess) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\NIKHIL GUPTA\\Pictures\\Saved Pictures\\"+nameofthess+".png");
		FileHandler.copy(source, destination);
	}

}
