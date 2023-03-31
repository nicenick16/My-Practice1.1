package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement switchto = driver.findElement(By.xpath("(//*[@href=\"SwitchTo.html\"])[1]"));
		switchto.click();
		WebElement iframe = driver.findElement(By.xpath("//*[@href=\"Frames.html\"]"));
		iframe.click();
	}


}
