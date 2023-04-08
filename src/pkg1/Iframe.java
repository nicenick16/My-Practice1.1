package pkg1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement switchto = driver.findElement(By.xpath("(//*[@href=\"SwitchTo.html\"])[1]"));
		switchto.click();
		WebElement iframe = driver.findElement(By.xpath("//*[@href=\"Frames.html\"]"));
//		driver.switchTo().frame(iframe);
		iframe.click();
		driver.switchTo().frame(0);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[@data-toggle='tab'])[2]")).click();
		Thread.sleep(500);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@style='float: left;height: 300px;width:600px']")));
		Thread.sleep(500);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@style='float: left;height: 250px;width: 400px']")));
//		Thread.sleep(500);
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("1235");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@data-toggle='tab'])[1]")).click();
		WebElement me = driver.findElement(By.xpath("//*[@name=\"SingleFrame\"]"));
		driver.switchTo().frame(me);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("456789");
	}
}
