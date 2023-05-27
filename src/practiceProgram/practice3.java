package practiceProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gb_g")).click();
		
		driver.switchTo().frame(driver.findElement(By.name("app")));
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(10000);
		 WebElement location = driver.findElement(By.id("searchboxinput"));
	location.sendKeys("Delhi");
	location.sendKeys(Keys.ENTER);
	
	}

}
