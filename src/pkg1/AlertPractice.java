package pkg1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[@href=\"SwitchTo.html\"])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[@href=\"Alerts.html\"])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class=\"btn btn-danger\"]")).click();
		Thread.sleep(500);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		driver.findElement(By.xpath("//*[@href=\"#CancelTab\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(2000);
		alt.accept();
		driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(2000);
		alt.dismiss();
		driver.findElement(By.xpath("//*[@href=\"#Textbox\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class=\"btn btn-info\"]")).click();
		Thread.sleep(2000);
		alt.sendKeys("Hello automation Nikhil");
		alt.accept();
		driver.findElement(By.xpath("//*[@class=\"btn btn-info\"]")).click();
		Thread.sleep(2000);
		alt.dismiss();	
	}
}